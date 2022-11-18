CREATE TABLE ISSUESLIST
(
ID		SERIAL PRIMARY KEY,
NAME	VARCHAR(200)
);

CREATE TABLE ISSUES
(
ID					SERIAL PRIMARY KEY,
ISSUESLIST_ID 		BIGINT UNSIGNED NOT NULL,
USER_ID_ASSIGNEDTO	BIGINT UNSIGNED NOT NULL,
SUMMARY				VARCHAR(1024),
DESCRIPTION			VARCHAR(2000),
FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS (ID)
);

SELECT * FROM ISSUESLIST;

SELECT * FROM ISSUES;

INSERT INTO ISSUESLIST (NAME)
VALUES ("ToDo");

INSERT INTO ISSUESLIST (NAME)
VALUES ("In progress");

INSERT INTO ISSUESLIST (NAME)
VALUES ("Done");

COMMIT;

SELECT * FROM ISSUESLIST;

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (1, 1, "WORKOUT", "Chest: 3 excersises x 4 sets");

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (2, 1, "STUDY", "Study with Kodilla. Module: SQL. For 2h");

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (3, 1, "MEALS", "Prepare meals for tommorow");

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (4, 1, "CLEAN UP", "Clean up at home");

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (5, 1, "GROCERY", "Grocery shopping. Buy food for next week. Shopping list on phone.");

INSERT INTO ISSUES (ISSUESLIST_ID, USER_ID_ASSIGNEDTO, SUMMARY, DESCRIPTION)
VALUES (6, 1, "WORK", "Work hard for 8 hours with one 30 min break");

COMMIT;

SELECT * FROM ISSUES;

SELECT * FROM ISSUESLIST;