# SpringRestBrickOrderExample

As a Rest Client
I want to submit new orders for bricks
So I can start customers’ orders

    Given
        A customer wants to buy any number of bricks
    When 
        A create Order request for a number of bricks is submitted
    Then
        an Order reference is returned
	And the Order reference is unique to the submission

As a Rest Client
I want to retrieve orders
So I can display simple customers’ orders

    Given
        A customer has submitted an order for some bricks
    When 
        A Get Order request is submitted with a valid Order reference
    Then
        the order details are returned
	and the order details contains the Order reference and the number of bricks ordered

    When 
        A Get Order request is submitted with an invalid Order reference
    Then
        no order details are returned


    Given
        Many customer have submitted orders for bricks
    When 
        A Get Orders request is submitted
    Then
        all the orders details are returned
	and the order details contains the Order reference and the number of bricks ordered
