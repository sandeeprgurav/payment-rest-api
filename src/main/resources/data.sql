DROP TABLE IF EXISTS customers;
 
CREATE TABLE customers (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone NUMBER NOT NULL,
  address VARCHAR(250) DEFAULT NULL,  
  active_flag boolean NULL,
  created_by VARCHAR(250) DEFAULT NULL,
  created_date Date,
  modified_by VARCHAR(250) DEFAULT NULL,
  modified_date Date
);


INSERT INTO customers (first_name, last_name, phone, address,active_flag,created_by, created_date,modified_by, modified_date) VALUES
  ('Sandeep', 'Gurav', '6303364637', 'New castle Delaware USA 19702', true, 'Sandeep', '2020-07-22',null,null),
  ('Pranjali', 'Yadav', '4153364637', 'Newark NJ USA 18702', true, 'Pranjali', '2020-06-22',null,null),
  ('Ramesh', 'Pavar', '5053364637', 'SFO USA 86702', true, 'Ramesh', '2020-07-20',null,null);
  
DROP TABLE IF EXISTS invoices;
 
CREATE TABLE invoices (
  invoice_id INT AUTO_INCREMENT  PRIMARY KEY,
  description VARCHAR(250) NOT NULL,
  amount Double NOT NULL,
  tax Double NOT NULL,
  supplier VARCHAR(250) DEFAULT NULL,
  invoice_number VARCHAR(20) NOT NULL,
  active_flag boolean NULL,
  created_by VARCHAR(250) DEFAULT NULL,
  created_date Date,
  modified_by VARCHAR(250) DEFAULT NULL,
  modified_date Date
);
 
INSERT INTO invoices (description, amount,tax, supplier, invoice_number, active_flag,created_by, created_date,modified_by, modified_date) VALUES
  ('Cloth Shopping', '100.00', '10.00', 'Macys', 'IN00000001',true, 'Sandeep', '2020-07-22',null,null),
  ('Sport Shopping', '400.00', '14.00','Dics', 'IN00000002',true, 'Pranjali', '2020-07-21',null,null),
  ('Home Utensils', '200.00', '12.00','Macys', 'IN00000003',true, 'Ramesh', '2020-07-20',null,null);
  
  
  DROP TABLE IF EXISTS billings;
  CREATE TABLE billings (
  billing_id INT AUTO_INCREMENT  PRIMARY KEY,
  invoice_id INT NOT NULL,
  payment_date Date NOT NULL,
  paid_date Date NOT NULL,
  paid_by VARCHAR(250) DEFAULT NULL,
  remaining_amount Double NOT NULL,
  fee Double NOT NULL,
  active_flag boolean NULL,
  created_by VARCHAR(250) DEFAULT NULL,
  created_date Date,
  modified_by VARCHAR(250) DEFAULT NULL,
  modified_date Date
);

INSERT INTO billings (invoice_id, payment_date, paid_date, paid_by,remaining_amount, fee, active_flag,created_by, created_date,modified_by, modified_date) VALUES
  ('1', '2020-08-22', '2020-07-26', 'Sandeep', '20',0, true, 'Sandeep', '2020-07-22',null,null),
  ('2', '2020-08-21', '2020-07-26', 'Pranjali', '10',10, true, 'Pranjali', '2020-07-21',null,null),
  ('3', '2020-08-20', '2020-07-26', 'Ramesh', '40',20,true, 'Ramesh', '2020-07-20',null,null);

 DROP TABLE IF EXISTS subscriptions;
 CREATE TABLE subscriptions (
  subscription_id INT AUTO_INCREMENT  PRIMARY KEY,
  customer_id INT NOT NULL,
  invoice_id INT NOT NULL,  
  order_date Date NOT NULL
);

INSERT INTO subscriptions (customer_id, invoice_id, order_date) VALUES
  ('1','1', '2020-08-22'),
  ('2','2', '2020-08-21'),
  ('3','3', '2020-08-20');


  
