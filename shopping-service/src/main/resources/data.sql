INSERT INTO tlb_invoices (id, number_invoice, description, customer_id, created_date, state, created_user) VALUES(1, '0001', 'invoice office items', 1, NOW(),'CREATED', 'Jael Rivera');

INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price ) VALUES(1, 1 , 1, 178.89);
INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price)  VALUES(1, 2 , 2, 12.5);
INSERT INTO tbl_invoce_items ( invoice_id, product_id, quantity, price)  VALUES(1, 3 , 1, 40.06);
