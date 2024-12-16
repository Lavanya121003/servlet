<!DOCTYPE html>
<html>
<head>
    <title>Sweet Order Form</title>
</head>
<body>
    <h2>Sweet Order Form</h2>
    <form action="Sweet" method="post">
        <label for="shopName">Select Shop Name:</label>
        <select id="shopName" name="shopName">
            <option value="Mothi Sweet">Moothi Sweets</option>
            <option value="Kanthi Sweets">Kanti sweets </option>
            <option value="SLV Sweets">SLV sweets </option>
            <option value="SJ Sweets">SJ sweets </option>
        </select>
        <br><br>
        <label for="sweetName">Select Sweet Name:</label>
        <select id="sweetName" name="sweetName">
            <option value="Laddu">Laddu</option>
            <option value="Barfi">Barfi</option>
            <option value="Jalebi">Jalebi</option>
            <option value="Jamun">jamun</option>
        </select>
        <br><br>
        <label for="isSpecial">Special:</label>
        <input type="checkbox" id="isSpecial" name="isSpecial">
        <br><br>
        <label for="quantity">Quantity (in kg):</label>
        <select id="quantity" name="quantity">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>

        </select>
        <br><br>
        <input type="submit" value="Calculate Total Cost">
    </form>
</body>
</html>
