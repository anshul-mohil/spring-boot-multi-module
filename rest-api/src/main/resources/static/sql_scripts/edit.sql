-- SELECT (SELECT COUNT(*) FROM SYM_PB_USERS WHERE PROJECT_ID = 1)        AS USER_COUNT,
--        (SELECT COUNT(*) FROM SYM_PB_ACTION_ITEMS WHERE PROJECT_ID = 1) AS ACTION_COUNT,
--        (SELECT COUNT(*) FROM SYM_PB_DEFECTS WHERE PROJECT_ID = 1)      AS DEFECT_COUNT,
--        (SELECT COUNT(*) FROM SYM_PB_FORUMS WHERE PROJECT_ID = 1)       AS FORUM_COUNT
-- FROM DUAL;






INSERT INTO SYSTEM.SYM_PB_PROJECTS (PROJECT_ID,
                                    PROJECT_NAME,
                                    DESCRIPTION,
                                    INSTRUCTIONS,
                                    DEPARTMENT_NAME,
                                    PRODUCT_NAME,
                                    PRODUCT_TYPE,
                                    MANAGER,
                                    NUMBER_OF_MACHINES,
                                    DUE_ON,
                                    PRODUCT_VERSION,
                                    START_DATE,
                                    END_DATE,
                                    GOAL,
                                    RELEASE_NOTES,
                                    PROJECT_TYPE,
                                    PUBLIC_OR_NOT,
                                    CREATION_DATE,
                                    LAST_UPDATE_DATE,
                                    CREATED_BY,
                                    LAST_UPDATED_BY,
                                    LAST_UPDATE_LOGIN,
                                    PROJECT_AGREEMENT,
                                    PROJECT_STATUS,
                                    AGREEMENT_STATUS)
VALUES (7,
        'Sym beta7',
        'bla bla bla ...',
        'none',
        'Cloud_Eng7',
        'Symentic_cloud7',
        null,
        'Naresh',
        14,
        null,
        1,
        null,
       null,
'100',
        'bla bla bla ..',
        null,
        'Y',
        null,
        null,
        'Naresh',
        'Naresh',
        null,
        'bla bla bla ...',
        null,
        null);