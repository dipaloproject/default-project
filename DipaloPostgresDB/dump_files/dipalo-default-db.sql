--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- Name: gender_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE gender_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.gender_id_seq OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: gender; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE gender (
    gender_id integer DEFAULT nextval('gender_id_seq'::regclass) NOT NULL,
    gender_desc text NOT NULL
);


ALTER TABLE public.gender OWNER TO postgres;

--
-- Name: general_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE general_user_id_seq
    START WITH 1000
    INCREMENT BY 1
    MINVALUE 1000
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.general_user_id_seq OWNER TO postgres;

--
-- Name: general_user; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE general_user (
    user_id integer DEFAULT nextval('general_user_id_seq'::regclass) NOT NULL,
    user_name character varying(30) NOT NULL,
    user_password text NOT NULL,
    user_active boolean DEFAULT true NOT NULL,
    date_added timestamp without time zone DEFAULT now() NOT NULL,
    user_role_id integer DEFAULT 0 NOT NULL
);


ALTER TABLE public.general_user OWNER TO postgres;

--
-- Name: person; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE person (
    first_names character varying(100) NOT NULL,
    last_name character varying(80) NOT NULL,
    id_number character varying(13) NOT NULL,
    date_of_birth timestamp without time zone NOT NULL,
    gender_id integer NOT NULL,
    race_id integer,
    contact_details_id integer NOT NULL,
    user_id integer NOT NULL
);


ALTER TABLE public.person OWNER TO postgres;

--
-- Name: race_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE race_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.race_id_seq OWNER TO postgres;

--
-- Name: race; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE race (
    race_id integer DEFAULT nextval('race_id_seq'::regclass) NOT NULL,
    race_desc text NOT NULL
);


ALTER TABLE public.race OWNER TO postgres;

--
-- Name: student_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE student_id_seq
    START WITH 10000
    INCREMENT BY 1
    MINVALUE 10000
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.student_id_seq OWNER TO postgres;

--
-- Name: student; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE student (
    first_names character varying(100),
    last_name character varying(80),
    id_number character varying(13),
    date_of_birth timestamp without time zone,
    gender_id integer DEFAULT 1,
    race_id integer DEFAULT 0,
    contact_details_id integer DEFAULT 0,
    user_id integer,
    student_id integer DEFAULT nextval('student_id_seq'::regclass) NOT NULL,
    grade_level integer DEFAULT 1 NOT NULL,
    school_id integer DEFAULT 0 NOT NULL,
    academic_stream_id integer DEFAULT 0 NOT NULL,
    exam_board_id integer DEFAULT 0 NOT NULL,
    date_registered timestamp without time zone DEFAULT now() NOT NULL
)
INHERITS (person);


ALTER TABLE public.student OWNER TO postgres;

--
-- Name: user_login_history_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE user_login_history_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_login_history_id_seq OWNER TO postgres;

--
-- Name: user_login_history; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE user_login_history (
    user_login_history_id integer DEFAULT nextval('user_login_history_id_seq'::regclass) NOT NULL,
    user_id integer DEFAULT 0 NOT NULL,
    date_logged_in timestamp without time zone DEFAULT now() NOT NULL,
    device_ip character varying(32) NOT NULL
);


ALTER TABLE public.user_login_history OWNER TO postgres;

--
-- Name: user_role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE user_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_role_id_seq OWNER TO postgres;

--
-- Name: user_role; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE user_role (
    user_role_id integer DEFAULT nextval('user_role_id_seq'::regclass) NOT NULL,
    user_role_desc text NOT NULL
);


ALTER TABLE public.user_role OWNER TO postgres;

--
-- Data for Name: gender; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY gender (gender_id, gender_desc) FROM stdin;
1	MALE
2	FEMALE
3	OTHER
\.


--
-- Name: gender_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('gender_id_seq', 3, true);


--
-- Data for Name: general_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY general_user (user_id, user_name, user_password, user_active, date_added, user_role_id) FROM stdin;
1000	dipalo-admin	bce926e949c3573d6d2c6db37658670eb925c330d692b6a635b438291dda115f	t	2013-07-28 12:45:58.574152	1
1001	dipalo-student	bce926e949c3573d6d2c6db37658670eb925c330d692b6a635b438291dda115f	t	2013-07-28 12:47:12.483492	3
\.


--
-- Name: general_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('general_user_id_seq', 1001, true);


--
-- Data for Name: person; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY person (first_names, last_name, id_number, date_of_birth, gender_id, race_id, contact_details_id, user_id) FROM stdin;
\.


--
-- Data for Name: race; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY race (race_id, race_desc) FROM stdin;
1	AFRICAN
2	WHITE
3	COLOURED
4	INDIAN
5	CHINESE
6	OTHER
\.


--
-- Name: race_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('race_id_seq', 6, true);


--
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY student (first_names, last_name, id_number, date_of_birth, gender_id, race_id, contact_details_id, user_id, student_id, grade_level, school_id, academic_stream_id, exam_board_id, date_registered) FROM stdin;
Neeva	Thompson	9011021102980	1990-11-02 00:00:00	2	3	0	1001	10000	12	0	0	0	2013-07-28 12:53:23.448147
\.


--
-- Name: student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('student_id_seq', 10000, true);


--
-- Data for Name: user_login_history; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY user_login_history (user_login_history_id, user_id, date_logged_in, device_ip) FROM stdin;
\.


--
-- Name: user_login_history_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('user_login_history_id_seq', 1, false);


--
-- Data for Name: user_role; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY user_role (user_role_id, user_role_desc) FROM stdin;
1	SYSTEM ADMINISTRATOR
2	SITE MANAGER
3	STUDENT
4	GUEST USER
\.


--
-- Name: user_role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('user_role_id_seq', 4, true);


--
-- Name: gender_gender_desc_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY gender
    ADD CONSTRAINT gender_gender_desc_key UNIQUE (gender_desc);


--
-- Name: gender_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY gender
    ADD CONSTRAINT gender_pkey PRIMARY KEY (gender_id);


--
-- Name: general_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY general_user
    ADD CONSTRAINT general_user_pkey PRIMARY KEY (user_id);


--
-- Name: general_user_user_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY general_user
    ADD CONSTRAINT general_user_user_name_key UNIQUE (user_name);


--
-- Name: race_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY race
    ADD CONSTRAINT race_pkey PRIMARY KEY (race_id);


--
-- Name: race_race_desc_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY race
    ADD CONSTRAINT race_race_desc_key UNIQUE (race_desc);


--
-- Name: student_id_number_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_id_number_key UNIQUE (id_number);


--
-- Name: student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_pkey PRIMARY KEY (student_id);


--
-- Name: student_user_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_user_id_key UNIQUE (user_id);


--
-- Name: user_login_history_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY user_login_history
    ADD CONSTRAINT user_login_history_pkey PRIMARY KEY (user_login_history_id);


--
-- Name: user_role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (user_role_id);


--
-- Name: user_role_user_role_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY user_role
    ADD CONSTRAINT user_role_user_role_key UNIQUE (user_role_desc);


--
-- Name: general_user_user_role_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY general_user
    ADD CONSTRAINT general_user_user_role_id_fkey FOREIGN KEY (user_role_id) REFERENCES user_role(user_role_id);


--
-- Name: student_gender_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_gender_id_fkey FOREIGN KEY (gender_id) REFERENCES gender(gender_id);


--
-- Name: student_race_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_race_id_fkey FOREIGN KEY (race_id) REFERENCES race(race_id);


--
-- Name: student_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_user_id_fkey FOREIGN KEY (user_id) REFERENCES general_user(user_id);


--
-- Name: user_login_history_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY user_login_history
    ADD CONSTRAINT user_login_history_user_id_fkey FOREIGN KEY (user_id) REFERENCES general_user(user_id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

