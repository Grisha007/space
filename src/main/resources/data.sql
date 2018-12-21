INSERT INTO MISSIONS (ID, MISSION_NAME, MISSION_START_DATE, MISSION_END_DATE, IMAGERY_TYPE)
VALUES (1, 'Mission 1', TO_DATE('15/05/2017', 'DD/MM/YYYY'), TO_DATE('17/09/2017', 'DD/MM/YYYY'), 'PANCHROMATIC');

INSERT INTO MISSIONS (ID, MISSION_NAME, MISSION_START_DATE, MISSION_END_DATE, IMAGERY_TYPE)
VALUES (2, 'Mission 2', TO_DATE('23/01/2018', 'DD/MM/YYYY'), TO_DATE('25/05/2018', 'DD/MM/YYYY'), 'MULTISPECTRAL');

INSERT INTO MISSIONS (ID, MISSION_NAME, MISSION_START_DATE, MISSION_END_DATE, IMAGERY_TYPE)
VALUES (3, 'Mission 3', TO_DATE('15/09/2018', 'DD/MM/YYYY'), TO_DATE('07/11/2018', 'DD/MM/YYYY'), 'HYPERSPECTRAL');



INSERT INTO PRODUCTS (ID, MISSION_ID, ACQUISITION_DATE, FIRST_COORDINATE, SECOND_COORDINATE, THIRD_COORDINATE, FOURTH_COORDINATE, PRODUCT_PRICE, PRODUCT_URL)
VALUES (1, 1, TO_DATE('18/05/2018', 'DD/MM/YYYY'), 251.58, 475.85, 658.97, 785.12, 7852.28, 'http://testurolone.com');

INSERT INTO PRODUCTS (ID, MISSION_ID, ACQUISITION_DATE, FIRST_COORDINATE, SECOND_COORDINATE, THIRD_COORDINATE, FOURTH_COORDINATE, PRODUCT_PRICE, PRODUCT_URL)
VALUES (2, 2, TO_DATE('12/07/2017', 'DD/MM/YYYY'), 221.58, 345.85, 468.97, 175.12, 17852.28, 'http://testuroltwo.com');

INSERT INTO PRODUCTS (ID, MISSION_ID, ACQUISITION_DATE, FIRST_COORDINATE, SECOND_COORDINATE, THIRD_COORDINATE, FOURTH_COORDINATE, PRODUCT_PRICE, PRODUCT_URL)
VALUES (3, 2, TO_DATE('19/11/2017', 'DD/MM/YYYY'), 241.58, 425.85, 648.97, 755.12, 78352.28, 'http://testurolthree.com');

INSERT INTO PRODUCTS (ID, MISSION_ID, ACQUISITION_DATE, FIRST_COORDINATE, SECOND_COORDINATE, THIRD_COORDINATE, FOURTH_COORDINATE, PRODUCT_PRICE, PRODUCT_URL)
VALUES (4, 3, TO_DATE('15/05/2018', 'DD/MM/YYYY'), 212.58, 245.85, 638.97, 745.12, 78152.28, 'http://testurolfour.com');

INSERT INTO PRODUCTS (ID, MISSION_ID, ACQUISITION_DATE, FIRST_COORDINATE, SECOND_COORDINATE, THIRD_COORDINATE, FOURTH_COORDINATE, PRODUCT_PRICE, PRODUCT_URL)
VALUES (5, 3, TO_DATE('21/05/2018', 'DD/MM/YYYY'), 211.58, 445.85, 268.97, 745.12, 78524.28, 'http://testurolfive.com');