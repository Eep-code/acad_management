-- =====================================================
-- USERS (Parent table)
-- =====================================================
-- Reset sequence
ALTER SEQUENCE users_id_seq RESTART WITH 1;

-- Parent table
INSERT INTO users (id, nom, prenom, email, password, role, active)
VALUES
(nextval('users_id_seq'), 'Youssef','Alami','encadrant@academix.edu','123456','ENCADRANT', true),
(nextval('users_id_seq'), 'Salma','Tazi','s.tazi@academix.edu','123456','ENCADRANT', true),
(nextval('users_id_seq'), 'Omar','Chraibi','o.chraibi@academix.edu','123456','ENCADRANT', true),

(nextval('users_id_seq'), 'Mehdi','Bakkali','etudiant@academix.edu','123456','ETUDIANT', true),
(nextval('users_id_seq'), 'Kenza','Fassi','k.fassi@academix.edu','123456','ETUDIANT', true),

(nextval('users_id_seq'), 'Walid','Naciri','w.naciri@academix.edu','123456','ETUDIANT', true),
(nextval('users_id_seq'), 'Hajar','Slaoui','h.slaoui@academix.edu','123456','ETUDIANT', true),

(nextval('users_id_seq'), 'Hamza','Idrissi','h.idrissi@academix.edu','123456','ETUDIANT', true),
(nextval('users_id_seq'), 'Laila','Ouazzani','l.ouazzani@academix.edu','123456','ETUDIANT', true),

(nextval('users_id_seq'), 'Sami','Kabbaj','s.kabbaj@academix.edu','123456','ETUDIANT', true),
(nextval('users_id_seq'), 'Yasmina','Berrada','y.berrada@academix.edu','123456','ETUDIANT', true);

-- =====================================================
-- ENCADRANTS
-- =====================================================

INSERT INTO encadrants (id) VALUES
(1),
(2),
(3);


-- =====================================================
-- GROUPES
-- =====================================================

INSERT INTO groupes (id, nom, encadrant_id) VALUES
(1,'Groupe Alpha - PFE AI Health',1),
(2,'Groupe IoT - Smart Agriculture',2),
(3,'Groupe Cyber - Blockchain Logistics',3),
(4,'Groupe Dev - E-Learning Interactive',1);


-- =====================================================
-- ETUDIANTS
-- =====================================================

INSERT INTO etudiants (id, groupe_id) VALUES
(4,1),
(5,1),

(6,2),
(7,2),

(8,3),
(9,3),

(10,4),
(11,4);


-- =====================================================
-- SUJETS
-- =====================================================

ALTER SEQUENCE sujets_id_seq RESTART WITH 1;

INSERT INTO sujets (id, titre, description, date_creation, statut) VALUES

(nextval('sujets_id_seq'),
'Plateforme IA de Détection Précoce de Pathologies Rétiniennes',
'Application Spring Boot + React intégrant un modèle Deep Learning.',
CURRENT_TIMESTAMP,
'AFFECTE'),

(nextval('sujets_id_seq'),
'Système IoT & Cloud pour l''Irrigation Intelligente',
'ESP32, MQTT et Dashboard de supervision.',
CURRENT_TIMESTAMP,
'AFFECTE'),

(nextval('sujets_id_seq'),
'Plateforme de Traçabilité Logistique basée sur Smart Contracts',
'Solution Blockchain Ethereum pour la chaîne logistique.',
CURRENT_TIMESTAMP,
'AFFECTE'),

(nextval('sujets_id_seq'),
'Plateforme E-Learning Microservices',
'Architecture Spring Cloud avec Gateway et Eureka.',
CURRENT_TIMESTAMP,
'AFFECTE'),

(nextval('sujets_id_seq'),
'Système de Détection d''Intrusions Réseau',
'Machine Learning pour la cybersécurité.',
CURRENT_TIMESTAMP,
'PROPOSE'),

(nextval('sujets_id_seq'),
'Application Mobile de Gestion Académique avec IA',
'Assistant académique utilisant Gemini API.',
CURRENT_TIMESTAMP,
'PROPOSE');


-- =====================================================
-- PROJETS
-- =====================================================

ALTER SEQUENCE projets_id_seq RESTART WITH 1;

INSERT INTO projets
(id,
 titre,
 description,
 date_debut,
 date_fin,
 etat,
 sujet_id)
VALUES

(nextval('projets_id_seq'),
'Plateforme IA de Détection Précoce de Pathologies Rétiniennes',
'Projet PFE IA Santé',
'2026-01-15',
'2026-06-30',
'EN_COURS',
1),

(nextval('projets_id_seq'),
'Système IoT de Surveillance Hydrique Agricole',
'Projet PFA Smart Agriculture',
'2026-02-01',
'2026-05-30',
'EN_ATTENTE_VALIDATION',
2),

(nextval('projets_id_seq'),
'Traçabilité Logistique Blockchain',
'Projet Blockchain',
'2026-01-10',
'2026-06-15',
'VALIDE',
3),

(nextval('projets_id_seq'),
'Plateforme E-Learning Microservices',
'Projet Microservices',
'2025-10-01',
'2026-02-28',
'CLOTURE',
4),

(nextval('projets_id_seq'),
'Détection d''Intrusions Réseau',
'Projet en attente d''affectation',
'2026-03-01',
'2026-07-31',
'PROPOSE',
5);