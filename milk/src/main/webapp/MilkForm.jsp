<!DOCTYPE html>
<html>
<head>
<title>Milk Form</title>
</head>
<h1>Milk order Form</h1>
<form action="MilkService" method="post">
<label for="brand">Brand:</label>
<select name="brand" id="brand">
<option value="Nandini">Nandini</option>
</select>
<br>
<br>
<label for="type">Type:</label>
<select name="type" id="type">
<option value="special">Special(56)</option>
<option value="ordinary">Ordinary(54)</option>
<option value="goodlife">GoodLife(67)</option>
<option value="goodlife_lite">GoodLife_Lite(68)</option>
<option value="family">Family(56)</option>
<option value="buffallo">Buffalo(70)</option>
</select>
<br>
<br>
<label for="quantity">Quantity:</label>
<input type="number" name="quantity" id="quantity" min="1" required><br><br>
<input type="submit" value"cost of milk">
</form>
</body>
</html>



