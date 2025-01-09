Problems :

Order and order items should be separate,
Payment process should be separate.
Payment Method not respect the OCP with the payment type


1. We can separate the order, and the order items into different class 
    to respect the single responsibility
    
2.  We can create a new Service for adding items into order
3. refactoring payment method to respect open close principle
    - create service for payment process
    
