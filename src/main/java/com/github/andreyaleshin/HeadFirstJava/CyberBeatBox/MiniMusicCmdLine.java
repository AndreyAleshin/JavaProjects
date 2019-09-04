package com.github.andreyaleshin.HeadFirstJava.CyberBeatBox;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String[] args) {

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        mini.play(114, 60);

        if (args.length < 2) {
            System.out.println("Don't forget arguments for an instrument and a notes");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);

        }
    }

    public void play(int instrument, int note) {

        try {

            // Получаем синтезатор и открываем его, чтобы начать использовать (изначально он не открыт)
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // Заранее подготовленные аргументы
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // Запрашиваем трек у последовательности (трек содержится внутри посл-ти, а MIDI-данные - в треке)
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            // Помещаем в трек MIDI-события. Этот код по большей части заранее подготовлен
            // Нужно лишь позаботиться  об аргументах для метода setMessage() и конструктора MidiEvent
            // Создаём сообщение
            ShortMessage a = new ShortMessage();

            /*
            Сообщение гласит: "Command - тип сообщения (144: начало проигрывания ноты, 128: конец),
            channel - музыкант в оркестре или муз. группе (канал №1 - клавишник, №9 - ударник),
            data1 - нота для проигрывания (от 0 до 127, начинается с низких и заканчивается высокими нотами),
            data2 - скорость и сила нажатия клавиши в %."
             */
            a.setMessage(144, 1, note, 100);

            /*
            Инструкции хранятся в сообщении, но MidiEvent дополняет их инф-ей о моменте времени,
            в который они должны сработать. Этот экземпляр MidiEvent говорит, что сообщение а сработает
            на первом такте (бит 1). Message говорит, ЧТО делать, а MidiEvent - КОГДА это делать
            */
            MidiEvent noteOn = new MidiEvent(a, 1);

            /*
            Трек хранит все объекты MidiEvent. Они размещаются в посл-ти согласно времени срабатывания,
            а синтезатор проигрывет их в заданном порядку. В один момент времени у вас может произойти
            множество событий. Например, вам понадобиться проиграть одновременно две ноты или даже несколько
            звуков из разных инструментов.
             */
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // Передаём посл-ть синтезатору (как-будто вставляем CD в проигрыватель)
            player.setSequence(seq);

            // Запускаем синтезатор (как-будто нажимаем Play)
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
