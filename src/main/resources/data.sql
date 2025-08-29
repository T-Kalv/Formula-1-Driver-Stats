--
-- PostgreSQL database dump
--

-- Dumped from database version 17.5 (Ubuntu 17.5-0ubuntu0.25.04.1)
-- Dumped by pg_dump version 17.5 (Ubuntu 17.5-0ubuntu0.25.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
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
-- Name: driver_statistic; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.driver_statistic (
    driver_id integer NOT NULL,
    driver_name character varying(255) NOT NULL,
    abbreviation character varying(255),
    number integer,
    team character varying(255),
    country character varying(255),
    podiums integer,
    points integer,
    grands_prix_entered integer,
    world_championships integer,
    highest_race_finish character varying(255),
    highest_grid_position integer,
    date_of_birth character varying(255),
    place_of_birth character varying(255),
    full_team_name character varying(255),
    base character varying(255),
    team_chief character varying(255),
    technical_chief character varying(255),
    chassis character varying(255),
    power_unit character varying(255),
    first_team_entry smallint,
    team_world_championships smallint,
    team_highest_race_finish character varying(255),
    pole_positions integer,
    fastest_laps integer
);


ALTER TABLE public.driver_statistic OWNER TO postgres;

--
-- Name: driver_statistic_driver_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.driver_statistic_driver_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.driver_statistic_driver_id_seq OWNER TO postgres;

--
-- Name: driver_statistic_driver_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.driver_statistic_driver_id_seq OWNED BY public.driver_statistic.driver_id;


--
-- Name: driver_statistic driver_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.driver_statistic ALTER COLUMN driver_id SET DEFAULT nextval('public.driver_statistic_driver_id_seq'::regclass);


--
-- Data for Name: driver_statistic; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.driver_statistic (driver_id, driver_name, abbreviation, number, team, country, podiums, points, grands_prix_entered, world_championships, highest_race_finish, highest_grid_position, date_of_birth, place_of_birth, full_team_name, base, team_chief, technical_chief, chassis, power_unit, first_team_entry, team_world_championships, team_highest_race_finish, pole_positions, fastest_laps) FROM stdin;
1	Max Verstappen	VER	1	Red Bull Racing	Netherlands	112	3024	209	4	1(x63)	1	1997-09-30	Hasselt, Belgium	Oracle Red Bull Racing	Milton Keynes, United Kingdom	Christian Horner	Pierre Waché	RB20	Honda RBPT	1997	6	1(x122)	103	99
2	Lando Norris	NOR	4	McLaren	United Kingdom	26	1007	128	0	1(x4)	1	1999-11-13	Bristol, England	McLaren Formula 1 Team	Woking, United Kingdom	Andrea Stella	Peter Prodromou / Neil Houldey	MCL38	Mercedes	1966	9	1(x189)	164	172
3	Charles Leclerc	LEC	16	Ferrari	Monaco	43	1430	149	0	1(x8)	1	1997-10-16	Monte Carlo, Monaco	Scuderia Ferrari HP	Maranello, Italy	Frédéric Vasseur	Loic Serra / Enrico Gualtieri	SF-24	Ferrari	1950	16	1(x249)	253	263
4	Oscar Piastri	PIA	81	McLaren	Australia	10	389	46	0	1(x2)	2	2001-04-06	Melbourne, Victoria	McLaren Formula 1 Team	Woking, United Kingdom	Andrea Stella	Peter Prodromou / Neil Houldey	MCL38	Mercedes	1966	9	1(x189)	164	172
5	Carlos Sainz	SAI	55	Ferrari	Spain	27	1273	208	0	1(x4)	1	1994-09-01	Madrid, Spain	Scuderia Ferrari HP	Maranello, Italy	Frédéric Vasseur	Loic Serra / Enrico Gualtieri	SF-24	Ferrari	1950	16	1(x249)	253	263
6	George Russell	RUS	63	Mercedes	United Kingdom	15	714	128	0	1(x3)	1	1998-02-15	King's Lynn, England	Mercedes-AMG Petronas F1 Team	Brackley, United Kingdom	Toto Wolff	James Allison	W15	Mercedes	1970	8	1(x120)	133	100
7	Lewis Hamilton	HAM	44	Mercedes	United Kingdom	202	4863	356	7	1(x105)	1	1985-01-07	Stevenage, England	Mercedes-AMG Petronas F1 Team	Brackley, United Kingdom	Toto Wolff	James Allison	W15	Mercedes	1970	8	1(x120)	133	100
8	Sergio Perez	PER	11	Red Bull Racing	Mexico	39	1638	282	0	1(x6)	1	1990-01-26	Guadalajara, Mexico	Oracle Red Bull Racing	Milton Keynes, United Kingdom	Christian Horner	Pierre Waché	RB20	Honda RBPT	1997	6	1(x122)	103	99
9	Fernando Alonso	ALO	14	Aston Martin	Spain	106	2337	404	2	1(x32)	1	1981-07-29	Oviedo, Spain	Aston Martin Aramco F1 Team	Silverstone, United Kingdom	Mike Crack	Bob Bell	AMR24	Mercedes	2018	0	1(x1)	1	3
10	Pierre Gasly	GAS	10	Alpine	France	5	436	154	0	1(x1)	2	1996-02-07	Rouen, France	BWT Alpine F1 Team	Enstone, United Kingdom	Oliver Oakes	David Sanchez	A524	Renault	1986	2	1(x21)	20	16
11	Nico Hulkenberg	HUL	27	Haas	Germany	0	571	230	0	4(x3)	1	1987-08-19	Emmerich am Rhein, Germany	MoneyGram Haas F1 Team	Kannapolis, United States	Ayao Komatsu	Andrea De Zordo	VF-24	Ferrari	2016	0	4(x1)	1	3
12	Yuki Tsunoda	TSU	22	RB	Japan	0	91	90	0	4(x1)	3	2000-05-11	Sagamihara, Japan	Visa Cash App RB Formula One Team	Faenza, Italy	Laurent Mekies	Jody Egginton	VCARB 01	Honda RBPT	1985	0	1(x2)	1	4
13	Lance Stroll	STR	18	Aston Martin	Canada	3	292	167	0	3(x3)	1	1998-10-29	Montreal, Canada	Aston Martin Aramco F1 Team	Silverstone, United Kingdom	Mike Crack	Bob Bell	AMR24	Mercedes	2018	0	1(x1)	1	3
14	Esteban Ocon	OCO	31	Alpine	France	4	445	156	0	1(x1)	3	1996-09-17	Evreux, Normandy	BWT Alpine F1 Team	Enstone, United Kingdom	Oliver Oakes	David Sanchez	A524	Renault	1986	2	1(x21)	20	16
15	Kevin Magnussen	MAG	20	Haas	Denmark	1	202	186	0	2(x1)	4	1992-10-05	Roskilde, Denmark	MoneyGram Haas F1 Team	Kannapolis, United States	Ayao Komatsu	Andrea De Zordo	VF-24	Ferrari	2016	0	4(x1)	1	3
16	Alexander Albon	ALB	23	Williams	Thailand	2	240	105	0	3(x2)	4	1996-03-23	London, England	Williams Racing	Grove, United Kingdom	James Vowles	Pat Fry	FW46	Mercedes	1978	9	1(x114)	128	133
17	Daniel Ricciardo	RIC	3	RB	Australia	32	1329	257	0	1(x8)	1	1989-07-01	Perth, Australia	Visa Cash App RB Formula One Team	Faenza, Italy	Laurent Mekies	Jody Egginton	VCARB 01	Honda RBPT	1985	0	1(x2)	1	4
18	Oliver Bearman	BEA	50	Haas	United Kingdom	0	7	3	0	7(x1)	10	2005-05-08	Chelmsford, England	MoneyGram Haas F1 Team	Kannapolis, United States	Ayao Komatsu	Andrea De Zordo	VF-24	Ferrari	2016	0	4(x1)	1	3
19	Franco Colapinto	COL	43	Williams	Argentina	0	5	9	0	8(x1)	8	2003-05-27	Buenos Aires, Argentina	Williams Racing	Grove, United Kingdom	James Vowles	Pat Fry	FW46	Mercedes	1978	9	1(x114)	128	133
20	Guanyu Zhou	ZHO	24	Kick Sauber	China	0	16	68	0	8(x2)	5	1999-05-30	Shanghai, China	Stake F1 Team Kick Sauber	Hinwil, Switzerland	Alessandro Alunni Bravi	James Key	C44	Ferrari	1993	0	1(x1)	1	7
21	Liam Lawson	LAW	30	RB	New Zealand	0	6	11	0	9(x3)	5	2002-02-11	Hastings, New Zealand	Visa Cash App RB Formula One Team	Faenza, Italy	Laurent Mekies	Jody Egginton	VCARB 01	Honda RBPT	1985	0	1(x2)	1	4
22	Valtteri Bottas	BOT	77	Kick Sauber	Finland	67	1797	246	0	1(x10)	1	1989-08-28	Nastola, Finland	Stake F1 Team Kick Sauber	Hinwil, Switzerland	Alessandro Alunni Bravi	James Key	C44	Ferrari	1993	0	1(x1)	1	7
23	Logan Sargeant	SAR	2	Williams	United States	0	1	36	0	10(x1)	6	2000-12-31	Fort Lauderdale, Florida	Williams Racing	Grove, United Kingdom	James Vowles	Pat Fry	FW46	Mercedes	1978	9	1(x114)	128	133
24	Jack Doohan	DOO	61	Alpine	Australia	0	0	1	0	15(x1)	17	2003-01-20	Gold Coast, Australia	BWT Alpine F1 Team	Enstone, United Kingdom	Oliver Oakes	David Sanchez	A524	Renault	1986	2	1(x21)	20	16
\.


--
-- Name: driver_statistic_driver_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.driver_statistic_driver_id_seq', 24, true);


--
-- Name: driver_statistic driver_statistic_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.driver_statistic
    ADD CONSTRAINT driver_statistic_pkey PRIMARY KEY (driver_id);


--
-- PostgreSQL database dump complete
--

