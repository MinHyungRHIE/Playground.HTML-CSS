# HTML 유용한 지식

## HTML Table
```html
<table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Age</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
</table>
```
### Cell that Span Many Columns

```html
<table style="width:100%">
  <tr>
    <th>Name</th>
    <th colspan="2">Telephone</th>
  </tr>
  <tr>
    <td>Bill Gates</td>
    <td>55577854</td>
    <td>55577855</td>
  </tr>
</table>
```

### HTML Table - Cell that Span Many Rows
```html
<table style="width:100%">
  <tr>
    <th>Name:</th>
    <td>Bill Gates</td>
  </tr>
  <tr>
    <th rowspan="2">Telephone:</th>
    <td>55577854</td>
  </tr>
  <tr>
    <td>55577855</td>
  </tr>
</table>
```

### HTML Table - Add a Caption
```html
<table style="width:100%">
  <caption>Monthly savings</caption>
  <tr>
    <th>Month</th>
    <th>Savings</th>
  </tr>
  <tr>
    <td>January</td>
    <td>$100</td>
  </tr>
  <tr>
    <td>February</td>
    <td>$50</td>
  </tr>
</table>
```
#### *CSS 활용팁*
 - Use the CSS `border` property to define a border
 - Use the CSS `border-collapse` property to collapse cell borders
 - Use the CSS `padding` property to add padding to cells
 - Use the CSS `text-align` property to align cell text
 - Use the CSS `border-spacing` property to set the spacing between cells

#### *속성 활용팁*
- Use the `colspan` attribute to make a cell span many columns
- Use the `rowspan` attribute to make a cell span many rows
- Use the `id` attribute to uniquely define one table

## HTML List
- unordered list

`list-style-type`
|Value|Description|
|:---|:---|
|disc|	Sets the list item marker to a bullet (default)|
|circle|	Sets the list item marker to a circle|
|square|	Sets the list item marker to a square|
|none|	The list items will not be marked|

```html
<ul style="list-style-type:disc;">
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ul>
```
*활용 사례 : Horizontal List with CSS*
```html
<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111111;
}
</style>
</head>
<body>

<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

</body>
</html>
```

- ordered list

`type`, `start`

|Value|Description|
|:---|:---|
|type="1"|The list items will be numbered with numbers (default)|
|type="A"|The list items will be numbered with uppercase letters|
|type="a"|The list items will be numbered with lowercase letters|
|type="I"|The list items will be numbered with uppercase roman numbers|
|type="i"|The list items will be numbered with lowercase roman numbers|
	

```html
<ol type="1">
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ol>
```

## HTML Block-level Elements and Inline Elements

The `<div>` element is a block-level element.

The `<span>` element is a Inline-level element.

### About \<div> tag

The \<div> element is often used as a container for other HTML elements.

The \<div> element has no required attributes, but style, class and id are common.

When used together with CSS, the \<div> element can be used to style blocks of content:

```html
<div style="background-color:black;color:white;padding:20px;">
  <h2>London</h2>
  <p>London is the capital city of England. It is the most populous city in the United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
</div>
```

### About \<span> tag

The `<span>` element is an inline container used to mark up a part of a text, or a part of a document.

The `<span>` element has no required attributes, but style, class and id are common.

When used together with CSS, the `<span>` element can be used to style parts of the text:

```html
<p>My mother has <span style="color:blue;font-weight:bold">blue</span> eyes and my father has <span style="color:darkolivegreen;font-weight:bold">dark green</span> eyes.</p>
```

## 속성 : class
The HTML class attribute is used to specify a class for an HTML element.

Multiple HTML elements can share the same class.

```html
<!DOCTYPE html>
<html>
<head>
<style>
.city {
  background-color: tomato;
  color: white;
  border: 2px solid black;
  margin: 20px;
  padding: 20px;
}
</style>
</head>
<body>

<div class="city">
  <h2>London</h2>
  <p>London is the capital of England.</p>
</div>

<div class="city">
  <h2>Paris</h2>
  <p>Paris is the capital of France.</p>
</div>

<div class="city">
  <h2>Tokyo</h2>
  <p>Tokyo is the capital of Japan.</p>
</div>

</body>
</html>
```

## 속성 : id
The HTML id attribute is used to specify a unique id for an HTML element.

You cannot have more than one element with the same id in an HTML document.


<!DOCTYPE html>
<html>
<head>
<style>
#myHeader {
  background-color: lightblue;
  color: black;
  padding: 40px;
  text-align: center;
}
</style>
</head>
<body>

<h1 id="myHeader">My Header</h1>

</body>
</html>


