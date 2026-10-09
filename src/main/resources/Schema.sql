CREATE TABLE PRODUCT (
                         Id INT PRIMARY KEY,
                         Name VARCHAR(30) NOT NULL,
                         Price INT NOT NULL CHECK (Price > 0)
);