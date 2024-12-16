<!DOCTYPE html>
<html>
<head>
    <title>Museum Ticket Form</title>
</head>
<body>
    <h2>Museum Ticket Form</h2>
    <form action="TicketService" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" required>
        <br><br>
        <label for="totalAdultMembers">Total Adult Members:</label>
        <input type="number" id="totalAdultMembers" name="totalAdultMembers" min="0" required>
        <br><br>
        <label for="totalChildMembers">Total Child Members:</label>
        <input type="number" id="totalChildMembers" name="totalChildMembers" min="0" required>
        <br><br>
        <label for="mobileNo">Mobile No:</label>
        <input type="text" id="mobileNo" name="mobileNo" required>
        <br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
