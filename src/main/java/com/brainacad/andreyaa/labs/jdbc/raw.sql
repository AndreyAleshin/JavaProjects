-- 1 --
CREATE SCHEMA store; -- Создание новой схемы

-- 2 --
-- Создание новой таблицы товаров
CREATE TABLE store.products
(
  id SERIAL, -- создание генератора ID по умолчанию (тип SERIAL)
  title character varying(255), -- создание поля текстового типа с ограничением на длинну 255 символов
  price numeric, -- создание поля числового типа
  created_at timestamp with time zone,  -- создание поля типа Timestamp (дата)
  tags character varying(255)[],
  CONSTRAINT products_pkey PRIMARY KEY (id) -- Первичный ключ, которым является колонка id
);


-- 3 --
-- Создание последовательности (т е генератора чисел (id)).
CREATE SEQUENCE store.users_id_seq
  INCREMENT 1 -- (Необязательный параметр) указывает, какое значение добавляется к текущему значению последовательности для создания нового значения
  MINVALUE 0 -- (Необязательный параметр)  oпределяет минимальное значение, которое может генерировать последовательность.
  MAXVALUE 1000000 --(Необязательный параметр) определяет максимальное значение для последовательности
  START 0 --(Необязательный параметр) позволяет последовательности начинаться где угодно
  CACHE 1000; -- (Необязательный параметр) указывает, сколько порядковых номеров должно быть предварительно выделено и сохранено в памяти для более быстрого доступа
ALTER TABLE store.users_id_seq
  OWNER TO postgres;


-- 4 --
CREATE TABLE store.users
(
  id integer NOT NULL DEFAULT nextval('store.users_id_seq'::regclass), -- вызов следующего значения последовательности, в качестве дефолтного значения ID (т е когда ID явно не указан)
  email character varying(255),
  password character varying(255),
  address text, -- поле типа текст без ограничения длинны
  created_at timestamp with time zone,
  CONSTRAINT users_pkey PRIMARY KEY (id)
);

-- 5 --
CREATE SEQUENCE store.purchases_id_seq
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 1000000
  START 0
  CACHE 1000;
ALTER TABLE store.purchases_id_seq
  OWNER TO postgres;

-- 6 --
CREATE TABLE store.purchases
(
  id integer NOT NULL DEFAULT nextval('store.purchases_id_seq'::regclass),
  created_at timestamp with time zone,
  name character varying(255),
  address character varying(255),
  zipcode integer,
  user_id integer, -- поле для внешнего ключа, значения должны совпадать с ID из таблицы users
  CONSTRAINT purchases_pkey PRIMARY KEY (id),
  CONSTRAINT purchases_user_id_fkey FOREIGN KEY (user_id) -- Создание внешнего ключа
      REFERENCES store.users (id) MATCH SIMPLE -- Указываем на какую таблицу и на какое поле будет указывать этот ключ
      ON UPDATE NO ACTION ON DELETE NO ACTION -- Указываем действия над внешней таблице, если меняется запись
);

-- 7 --
CREATE TABLE store.purchase_items
(
  id SERIAL,
  purchase_id integer,
  product_id integer,
  price numeric,
  quantity integer,
  state character varying(255),
  CONSTRAINT purchase_items_pkey PRIMARY KEY (id),
  CONSTRAINT purchase_items_product_id_fkey FOREIGN KEY (product_id) -- Первый внешний ключ
      REFERENCES store.products (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT purchase_items_purchase_id_fkey FOREIGN KEY (purchase_id) -- Еще один внешний ключ
      REFERENCES store.purchases (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
