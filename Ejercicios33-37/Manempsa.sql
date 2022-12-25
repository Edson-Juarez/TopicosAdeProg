--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2021-01-26 04:12:48

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3076 (class 1262 OID 16456)
-- Name: Manempsa; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Manempsa" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Mexico.1252';


ALTER DATABASE "Manempsa" OWNER TO postgres;

\connect "Manempsa"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 24648)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    cif character varying(15) NOT NULL,
    nombre character varying(25),
    "dirección" character varying(25),
    tfno1 bigint,
    tfno2 bigint
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 24775)
-- Name: clientesdeseguros; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.clientesdeseguros AS
 SELECT clientes.cif,
    clientes.nombre,
    clientes."dirección",
    clientes.tfno2 AS telefonofijo
   FROM public.clientes
  WHERE (((clientes.nombre)::text ~~ 'Academia%'::text) AND ((clientes.nombre)::text ~~ 'Pape&'::text));


ALTER TABLE public.clientesdeseguros OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16469)
-- Name: coches; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.coches (
    matricula character varying(15),
    marca character varying(15),
    modelo character varying(15),
    anio integer NOT NULL,
    dni character varying
);


ALTER TABLE public.coches OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 24655)
-- Name: servicios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.servicios (
    numero integer NOT NULL,
    fecha date NOT NULL,
    tipo character varying(15),
    comentario character varying(40),
    dni character varying,
    cif character varying(40) NOT NULL,
    cantidad money NOT NULL
);


ALTER TABLE public.servicios OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16457)
-- Name: trabajadores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.trabajadores (
    dni character varying(20),
    nombre character varying(10),
    apellidos character varying(10),
    sueldo money NOT NULL,
    fecha date,
    "matrícula" character varying
);


ALTER TABLE public.trabajadores OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 24696)
-- Name: listado_de_servicios_de_electricidad; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.listado_de_servicios_de_electricidad AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    servicios.comentario,
    trabajadores.nombre,
    trabajadores.apellidos,
    clientes.nombre AS nombrecliente
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((servicios.tipo)::text = 'Electricidad'::text);


ALTER TABLE public.listado_de_servicios_de_electricidad OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 24783)
-- Name: listadodeacademiasypapelerías; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public."listadodeacademiasypapelerías" AS
 SELECT clientes.cif,
    clientes.nombre,
    clientes."dirección",
    clientes.tfno2 AS telefonofijo
   FROM public.clientes
  WHERE (((clientes.nombre)::text ~~ 'A%'::text) AND ((clientes.nombre)::text ~~ 'P&'::text));


ALTER TABLE public."listadodeacademiasypapelerías" OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 24787)
-- Name: seatytrabajadores; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.seatytrabajadores AS
 SELECT coches.matricula,
    coches.marca,
    coches.modelo,
    trabajadores.nombre,
    trabajadores.apellidos
   FROM (public.coches
     JOIN public.trabajadores ON (((coches.dni)::text = (trabajadores.dni)::text)))
  WHERE ((coches.marca)::text = 'Seat'::text);


ALTER TABLE public.seatytrabajadores OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 24761)
-- Name: servicios_en_la_calle_larga; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.servicios_en_la_calle_larga AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    trabajadores.dni,
    clientes.nombre AS nombrecliente,
    clientes."dirección"
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((clientes."dirección")::text ~~ 'C/Larga%'::text);


ALTER TABLE public.servicios_en_la_calle_larga OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 24653)
-- Name: servicios_numero_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.servicios_numero_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.servicios_numero_seq OWNER TO postgres;

--
-- TOC entry 3077 (class 0 OID 0)
-- Dependencies: 203
-- Name: servicios_numero_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.servicios_numero_seq OWNED BY public.servicios.numero;


--
-- TOC entry 206 (class 1259 OID 24701)
-- Name: servicios_ralizados_por_juan; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.servicios_ralizados_por_juan AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    servicios.comentario,
    trabajadores.nombre,
    trabajadores.apellidos,
    clientes.nombre AS nombrecliente
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((servicios.dni)::text = '2.321.567-B'::text);


ALTER TABLE public.servicios_ralizados_por_juan OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 24706)
-- Name: servicios_realizados_por_juan; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.servicios_realizados_por_juan AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    servicios.comentario,
    trabajadores.nombre,
    trabajadores.apellidos,
    clientes.nombre AS nombrecliente
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((servicios.dni)::text = '12.321.567-B'::text);


ALTER TABLE public.servicios_realizados_por_juan OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 24766)
-- Name: servicios_trabajadores_2006; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.servicios_trabajadores_2006 AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    trabajadores.apellidos,
    trabajadores.nombre,
    trabajadores.fecha AS "contratación"
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE (trabajadores.fecha > '2006-01-01'::date);


ALTER TABLE public.servicios_trabajadores_2006 OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 24751)
-- Name: serviciosa_academias; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.serviciosa_academias AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    servicios.comentario,
    trabajadores.nombre,
    trabajadores.apellidos,
    clientes.nombre AS cliente_nombre
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((clientes.nombre)::text ~~ 'A%'::text);


ALTER TABLE public.serviciosa_academias OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 24756)
-- Name: serviciosdelaño2006; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public."serviciosdelaño2006" AS
 SELECT servicios.fecha,
    servicios.tipo,
    servicios.cantidad,
    trabajadores.apellidos,
    clientes.nombre AS nombrecliente,
    clientes.cif
   FROM ((public.servicios
     JOIN public.clientes ON (((clientes.cif)::text = (servicios.cif)::text)))
     JOIN public.trabajadores ON (((servicios.dni)::text = (trabajadores.dni)::text)))
  WHERE ((servicios.fecha >= '2006-01-01'::date) AND (servicios.fecha <= '2006-12-31'::date));


ALTER TABLE public."serviciosdelaño2006" OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 24791)
-- Name: serviciosrealizadosconcitroen; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.serviciosrealizadosconcitroen AS
 SELECT coches.matricula,
    coches.marca,
    coches.modelo,
    trabajadores.nombre,
    trabajadores.apellidos,
    clientes.nombre AS nombrecliente,
    clientes."dirección",
    servicios.tipo,
    servicios.cantidad
   FROM (((public.coches
     JOIN public.trabajadores ON (((coches.dni)::text = (trabajadores.dni)::text)))
     JOIN public.servicios ON (((coches.dni)::text = (servicios.dni)::text)))
     JOIN public.clientes ON (((servicios.cif)::text = (clientes.cif)::text)))
  WHERE ((coches.marca)::text = 'CITROEN'::text);


ALTER TABLE public.serviciosrealizadosconcitroen OWNER TO postgres;

--
-- TOC entry 2909 (class 2604 OID 24658)
-- Name: servicios numero; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servicios ALTER COLUMN numero SET DEFAULT nextval('public.servicios_numero_seq'::regclass);


--
-- TOC entry 3068 (class 0 OID 24648)
-- Dependencies: 202
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.clientes (cif, nombre, "dirección", tfno1, tfno2) VALUES ('B11223212', 'Seguros Segasa', 'C/Ancha2', 956344334, 629234323);
INSERT INTO public.clientes (cif, nombre, "dirección", tfno1, tfno2) VALUES ('B33221111', 'Papelería Cuatro', 'C/Larga 8', 956305060, 0);
INSERT INTO public.clientes (cif, nombre, "dirección", tfno1, tfno2) VALUES ('B44556666', 'Seguros cruces', 'C/Lealas 5', 956309020, 633212342);
INSERT INTO public.clientes (cif, nombre, "dirección", tfno1, tfno2) VALUES ('B55112233', 'Papeleria el boligrafo', 'Parque Atlántic', 0, 670787878);
INSERT INTO public.clientes (cif, nombre, "dirección", tfno1, tfno2) VALUES ('B55334433', 'Seguros la paz', 'C/Larga 3', 956202020, 0);


--
-- TOC entry 3067 (class 0 OID 16469)
-- Dependencies: 201
-- Data for Name: coches; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.coches (matricula, marca, modelo, anio, dni) VALUES ('1144-BBB', 'CITROEN', 'C3', 2005, '22.333.444-C');
INSERT INTO public.coches (matricula, marca, modelo, anio, dni) VALUES ('3322-ASR', 'SEAT', 'Ibiza', 2000, '21.123.123-A');
INSERT INTO public.coches (matricula, marca, modelo, anio, dni) VALUES ('4433-ABB', 'CITROEN', 'Saxo', 2001, '12.321.567-B');


--
-- TOC entry 3070 (class 0 OID 24655)
-- Dependencies: 204
-- Data for Name: servicios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (1, '2004-04-12', 'Limpieza', '', '21.123.123-A', 'B11223212', '$300.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (2, '2005-05-22', 'Fontanería', 'arreglo tuberías', '12.321.567-B', 'B22334466', '$238.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (3, '2005-12-21', 'Electricidad', 'revisión cableado', '21.123.123-A', 'B33221111', '$130.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (4, '2006-11-10', 'Fontanería', '', '12.321.567-B', 'B11223212', '$250.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (5, '2006-06-03', 'Fontanería', 'desatascos servicio', '21.123.123-A', 'B55112233', '$214.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (6, '2006-06-12', 'Limpieza', 'limpieza cristales', '22.333.444-C', 'B55334433', '$265.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (7, '2006-07-20', 'Limpieza', '', '12.321.567-B', 'B44556666', '$170.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (8, '2006-08-01', 'Electricidad', 'recambio paneles', '22.333.444-C', 'B44557777', '$160.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (9, '2006-08-05', 'Limpieza', 'limpieza fachada', '12.321.567-B', 'B44556666', '$250.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (10, '2006-08-08', 'Fontanería', '', '12.321.567-B', 'B44557777', '$265.00');
INSERT INTO public.servicios (numero, fecha, tipo, comentario, dni, cif, cantidad) VALUES (11, '2006-08-09', 'Limpieza', 'limpieza cristales', '22.333.444-C', 'B44556666', '$139.00');


--
-- TOC entry 3066 (class 0 OID 16457)
-- Dependencies: 200
-- Data for Name: trabajadores; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.trabajadores (dni, nombre, apellidos, sueldo, fecha, "matrícula") VALUES ('12.321.567-B', 'Juan', 'Pérez', '$1,120.00', '2002-05-04', '4433-ABB');
INSERT INTO public.trabajadores (dni, nombre, apellidos, sueldo, fecha, "matrícula") VALUES ('21.123.123-A', 'Ana', 'Ruiz', '$1,200.00', '2002-03-02', '3322-ASR');
INSERT INTO public.trabajadores (dni, nombre, apellidos, sueldo, fecha, "matrícula") VALUES ('22.333.444-C', 'Francisco', 'López', '$1,000.00', '2006-06-01', '1144-BBB');


--
-- TOC entry 3078 (class 0 OID 0)
-- Dependencies: 203
-- Name: servicios_numero_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.servicios_numero_seq', 11, true);


--
-- TOC entry 2917 (class 2606 OID 24652)
-- Name: clientes clientes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (cif);


--
-- TOC entry 2921 (class 2606 OID 24660)
-- Name: servicios servicios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servicios
    ADD CONSTRAINT servicios_pkey PRIMARY KEY (numero);


--
-- TOC entry 2919 (class 2606 OID 24693)
-- Name: clientes uq_cif; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT uq_cif UNIQUE (cif);


--
-- TOC entry 2911 (class 2606 OID 24671)
-- Name: trabajadores uq_dni; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.trabajadores
    ADD CONSTRAINT uq_dni UNIQUE (dni);


--
-- TOC entry 2915 (class 2606 OID 24664)
-- Name: coches uq_matricula; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.coches
    ADD CONSTRAINT uq_matricula UNIQUE (matricula);


--
-- TOC entry 2913 (class 2606 OID 24662)
-- Name: trabajadores uq_matrícula; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.trabajadores
    ADD CONSTRAINT "uq_matrícula" UNIQUE ("matrícula");


--
-- TOC entry 2923 (class 2606 OID 24672)
-- Name: coches fk_coches_dni; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.coches
    ADD CONSTRAINT fk_coches_dni FOREIGN KEY (dni) REFERENCES public.trabajadores(dni);


--
-- TOC entry 2924 (class 2606 OID 24682)
-- Name: servicios fk_servicios_dni; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servicios
    ADD CONSTRAINT fk_servicios_dni FOREIGN KEY (dni) REFERENCES public.trabajadores(dni);


--
-- TOC entry 2922 (class 2606 OID 24665)
-- Name: trabajadores fk_trabajadores_matrícula; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.trabajadores
    ADD CONSTRAINT "fk_trabajadores_matrícula" FOREIGN KEY ("matrícula") REFERENCES public.coches(matricula);


-- Completed on 2021-01-26 04:12:57

--
-- PostgreSQL database dump complete
--

