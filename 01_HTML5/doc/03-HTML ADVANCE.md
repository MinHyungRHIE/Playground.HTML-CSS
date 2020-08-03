# HTML 고급

## HTML Forms
 - \<form>
```html
<form>
.
form elements
.
</form>
```
\<form> 요소들 :
 - \<label>
 - \<input>
 - \<select>
 - \<textarea>
 - \<button>
 - \<fieldset>
 - \<legend>
 - \<datalist>
 - \<output>
 - \<option>
 - \<optgroup>

### \<input>
```html
<form action="/action_page.php">
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname"><br><br>
  <input type="submit" value="Submit">
</form>
```

### \<select>
```html
<label for="cars">Choose a car:</label>
<select id="cars" name="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
```
The \<option> elements defines an option that can be selected.

By default, the first item in the drop-down list is selected.

To define a pre-selected option, add the selected attribute to the option:

```html
<option value="fiat" selected>Fiat</option>
```

Use the size attribute to specify the number of visible values:
```html
<select id="cars" name="cars" size="3">
```

Use the multiple attribute to allow the user to select more than one value:
```html
<select id="cars" name="cars" size="4" multiple>
```

### \<textarea>
The \<textarea> element defines a multi-line input field (a text area):
```html
<textarea name="message" rows="10" cols="30">
The cat was playing in the garden.
</textarea>
```
You can also define the size of the text area by using CSS:
```html
<textarea name="message" style="width:200px; height:600px;">
The cat was playing in the garden.
</textarea>
```

### \<button>
The \<button> element defines a clickable button:
```html
<button type="button" onclick="alert('Hello World!')">Click Me!</button>
```

### \<fieldset> and \<legend>

The \<fieldset> element is used to group related data in a form.

The \<legend> element defines a caption for the \<fieldset> element.
```html
<form action="/action_page.php">
  <fieldset>
    <legend>Personalia:</legend>
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" value="John"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe"><br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>
```

### \<datalist>
```html
<form action="/action_page.php">
  <input list="browsers">
  <datalist id="browsers">
    <option value="Internet Explorer">
    <option value="Firefox">
    <option value="Chrome">
    <option value="Opera">
    <option value="Safari">
  </datalist>
</form>
```
### form 속성 활용
```html
<!DOCTYPE html>
<html>
<body>

<h1>The input form attribute</h1>

<p>The form attribute specifies the form an input element belongs to.</p>

<form action="/action_page.php" id="form1">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <input type="submit" value="Submit">
</form>

<p>The "Last name" field below is outside the form element, but still part of the form.</p>

<label for="lname">Last name:</label>
<input type="text" id="lname" name="lname" form="form1">

</body>
</html>
```
### formaction 속성 활용
```html
<form action="/action_page.php">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <input type="submit" value="Submit">
  <input type="submit" formaction="/action_page2.php" value="Submit as Admin">
</form>
```

### formenctype 속성 활용
The input formenctype attribute specifies how the form-data should be encoded when submitted (only for forms with method="post").

```html
<form action="/action_page_binary.asp" method="post">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <input type="submit" value="Submit">
  <input type="submit" formenctype="multipart/form-data" value="Submit as Multipart/form-data">
</form>
```

### formmethod 속성 활용
The input formmethod attribute defines the HTTP method for sending form-data to the action URL.

```html
<form action="/action_page.php" method="get">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <input type="submit" value="Submit using GET">
  <input type="submit" formmethod="post" value="Submit using POST">
</form>
```
### formtarget 속성 활용
```html
<form action="/action_page.php">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <input type="submit" value="Submit">
  <input type="submit" formtarget="_blank" value="Submit to a new window/tab">
</form>
```
### formnovalidate 속성 활용
```html
<form action="/action_page.php">
  <label for="email">Enter your email:</label>
  <input type="email" id="email" name="email"><br><br>
  <input type="submit" value="Submit">
  <input type="submit" formnovalidate="formnovalidate"
  value="Submit without validation">
</form>
```
### novalidate 속성 활용
```html
<form action="/action_page.php" novalidate>
  <label for="email">Enter your email:</label>
  <input type="email" id="email" name="email"><br><br>
  <input type="submit" value="Submit">
</form>
```

## HTML Input Types
- \<input type="button">
- \<input type="checkbox">
- \<input type="color">
- \<input type="date">
- \<input type="datetime-local">
- \<input type="email">
- \<input type="file">
- \<input type="hidden">
- \<input type="image">
- \<input type="month">
- \<input type="number">
- \<input type="password">
- \<input type="radio">
- \<input type="range">
- \<input type="reset">
- \<input type="search">
- \<input type="submit">
- \<input type="tel">
- \<input type="text">
- \<input type="time">
- \<input type="url">
- \<input type="week">

Attribute |	Description
----------|-------------
checked	| Specifies that an input field should be pre-selected when the page loads (for type="checkbox" or type="radio")
disabled|	Specifies that an input field should be disabled
max	|Specifies the maximum value for an input field
maxlength|	Specifies the maximum number of character for an input field
min|	Specifies the minimum value for an input field
pattern	|Specifies a regular expression to check the input value against
readonly|	Specifies that an input field is read only (cannot be changed)
required|	Specifies that an input field is required (must be filled out)
size|	Specifies the width (in characters) of an input field
step|	Specifies the legal number intervals for an input field
value	|Specifies the default value for an input field
multiple | The input multiple attribute specifies that the user is allowed to enter more than one value in an input field. The multiple attribute works with the following input types: email, and file.
placeholder | 어떻게 채워넣으라는 예시글
autofocus | 말 그대로 자동 포커싱
autocomplete | 자동 채워주기 `autocomplete="on"` or `autocomplete="off"`

## HTML Media

### Video
```html
<video width="320" height="240" controls> 
                    or
<video width="320" height="240" autoplay>
  <source src="movie.mp4" type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
Your browser does not support the video tag.
</video>
```
### Audio
```html
<audio controls>
  <source src="horse.ogg" type="audio/ogg">
  <source src="horse.mp3" type="audio/mpeg">
Your browser does not support the audio element.
</audio>
```
### Video
```html
<video width="320" height="240" controls> 
                    or
<video width="320" height="240" autoplay>
  <source src="movie.mp4" type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
Your browser does not support the video tag.
</video>
```
### Youtube 활용법

 - \<iframe> 이용하기

```html
<iframe width="420" height="315"
src="https://www.youtube.com/embed/tgbNymZ7vqY">
</iframe>
```

