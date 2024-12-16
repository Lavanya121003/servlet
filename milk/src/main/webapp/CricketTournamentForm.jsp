<!DOCTYPE html>
<html>
<head>
    <title>Cricket Tournament Form</title>
</head>
<body>
    <h2>Cricket Tournament Form</h2>
    <form action="TournamentService" method="post">
        <label for="tournamentName">Tournament Name:</label>
        <input type="text" id="tournamentName" name="tournamentName" required>
        <br><br>
        <label for="organizerName">Organizer Name:</label>
        <input type="text" id="organizerName" name="organizerName" required>
        <br><br>
        <label for="location">Location:</label>
        <input type="text" id="location" name="location" required>
        <br><br>
        <label for="startDate">Start Date:</label>
        <input type="date" id="startDate" name="startDate" required>
        <br><br>
        <label for="endDate">End Date:</label>
        <input type="date" id="endDate" name="endDate" required>
        <br><br>
        <label for="totalTeams">Total Teams:</label>
        <input type="number" id="totalTeams" name="totalTeams" min="1" required>
        <br><br>
        <label for="contactNumber">Contact Number:</label>
        <input type="text" id="contactNumber" name="contactNumber" required>
        <br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
