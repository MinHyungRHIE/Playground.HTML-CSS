# 💻 CSS 맛보기

## 1. Syntax

### - Selector, Declaration, Property, Value

```css
h1 <== Selector {
    color:blue; <== Declaration
    Property : Value;
}
/* 주석 Comments */
```

<br><br><br><br><br>
<br><br><br><br><br>

## 2. Selectors

### The CSS element Selector

```css
p {
  text-align: center;
  color: red;
}
```

### The CSS id Selector

```css
#para1 {
  text-align: center;
  color: red;
}
```

### The CSS class Selector

```css
.center {
  text-align: center;
  color: red;
}
```

주의

`.class1.class2` 와 `.class1 .class2`는 다름. 차이는 공백이 있냐 없냐

스타일에서 클래스를 지정해서 사용할때 앞쪽 대상뒤의 클래스를 입력할 때 공백이 있을 경우와 없을경우의 차이가 있다.
공백이 있을경우는 해당 대상의 하위객체에 해당 클래스가 있으면 해당 스타일을 적용하라는 뜻이다.
```html
<style type="text/css">
<!--
div .aa {
	color: #ddd;
}
-->
</style>
<div class="aa">
no style
<span class="aa">color : #ddd</span>
</div>
```
위와같이 div 뒤에 공백이 있고 그 뒤에 .aa 라고 클래스를 지정했을 경우는 div 안에서 다른 태그에 aa라는
클래스를 지정했을 때만 컬러가 적용된다. 그래서 'no style' 텍스트는 aa 스타일이 적용되지 않고 보여진다.

하지만 스타일을 정의할때 div.aa 라고  적용을 했다면 'no style' 텍스트에도 스타일이 적용될것이다.
즉 div태그에 aa클래스가 선언되어있으면 해당 태그 하위 모든 텍스트에 똑같이 스타일을 적용한다는 뜻이다.

### The CSS Universal Selector

```css
* {
  text-align: center;
  color: blue;
}
```

### The CSS Grouping Selector

```css
h1, h2, p {
  text-align: center;
  color: red;
}
```

<br><br><br><br><br>
<br><br><br><br><br>

## 3. How To Use CSS

### External CSS

```html
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystyle.css">
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

 - mystyle.css

```css
body {
  background-color: lightblue;
}

h1 {
  color: navy;
  margin-left: 20px;
}
```

### Internal CSS

```html
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: linen;
}

h1 {
  color: maroon;
  margin-left: 40px;
}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

### Inline CSS

```html
<!DOCTYPE html>
<html>
<body>

<h1 style="color:blue;text-align:center;">This is a heading</h1>
<p style="color:red;">This is a paragraph.</p>

</body>
</html>
```

#### 우선순위

 1. Inline style (inside an HTML element)
 1. External and internal style sheets (in the head section)
 1. Browser default


<br><br><br><br><br>
<br><br><br><br><br>

## 4. CSS 색깔 다루기

### `background-color` (Background Color)

```html
<h1 style="background-color:DodgerBlue;">Hello World</h1>
<p style="background-color:Tomato;">Lorem ipsum...</p>
```

### `color` (Text Color)

```html
<h1 style="color:Tomato;">Hello World</h1>
<p style="color:DodgerBlue;">Lorem ipsum...</p>
<p style="color:MediumSeaGreen;">Ut wisi enim...</p>
```

### `border` (Border Color)

```html
<h1 style="border:2px solid Tomato;">Hello World</h1>
<h1 style="border:2px solid DodgerBlue;">Hello World</h1>
<h1 style="border:2px solid Violet;">Hello World</h1>
```

### Color Values

 - rgb(255, 99, 71)
 - #ff6347
 - hsl(9, 100%, 64%)
 - rgba(255, 99, 71, 0.5)
 - hsla(9, 100%, 64%, 0.5)

<br><br><br><br><br>
<br><br><br><br><br>

## 5. Backgrounds 다루기

### Background Color

```css
div {
  background-color: green;
  opacity: 0.3;
}
```

### Background Image

```css
body {
  background-image: url("paper.gif");
}
```


```css
body {
  background-image: url("gradient_bg.png");
  background-repeat: repeat-x; /*오직 수평으로만 반복, 수직:repeat-y, 반복X:no-repeat*/
}
```

```css
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top; /*그림 위치*/
}
```


### Background Attachment

```css
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top;
  background-attachment: fixed;
}
```

```css
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top;
  background-attachment: scroll;
}
```

### Shorthand property

```css
body {
  background-color: #ffffff;
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top;
}
```

```css
body {
  background: #ffffff url("img_tree.png") no-repeat right top;
}
```

<br><br><br><br><br>
<br><br><br><br><br>

## 6. Borders

### border-style

 - dotted - Defines a dotted border
 - dashed - Defines a dashed border
 - solid - Defines a solid border
 - double - Defines a double border
 - groove - Defines a 3D grooved border. The effect depends on the border-color value
 - ridge - Defines a 3D ridged border. The effect depends on the border-color value
 - inset - Defines a 3D inset border. The effect depends on the border-color value
 - outset - Defines a 3D outset border. The effect depends on the border-color value
 - none - Defines no border
 - hidden - Defines a hidden border

```css
p.dotted {border-style: dotted;}
p.dashed {border-style: dashed;}
p.solid {border-style: solid;}
p.double {border-style: double;}
p.groove {border-style: groove;}
p.ridge {border-style: ridge;}
p.inset {border-style: inset;}
p.outset {border-style: outset;}
p.none {border-style: none;}
p.hidden {border-style: hidden;}
p.mix {border-style: dotted dashed solid double;}
```

![border-style](./css-resource/border-style.png)

 - EXAMPLE


```html
<!DOCTYPE html>
<html>
<head>
<style>
p.dotted {border-style: dotted;}
p.dashed {border-style: dashed;}
p.solid {border-style: solid;}
p.double {border-style: double;}
p.groove {border-style: groove;}
p.ridge {border-style: ridge;}
p.inset {border-style: inset;}
p.outset {border-style: outset;}
p.none {border-style: none;}
p.hidden {border-style: hidden;}
p.mix {border-style: dotted dashed solid double;}
</style>
</head>
<body>

<h2>The border-style Property</h2>
<p>This property specifies what kind of border to display:</p>

<p class="dotted">A dotted border.</p>
<p class="dashed">A dashed border.</p>
<p class="solid">A solid border.</p>
<p class="double">A double border.</p>
<p class="groove">A groove border.</p>
<p class="ridge">A ridge border.</p>
<p class="inset">An inset border.</p>
<p class="outset">An outset border.</p>
<p class="none">No border.</p>
<p class="hidden">A hidden border.</p>
<p class="mix">A mixed border.</p>

</body>
</html>
```

### Border Width

```css
p.one {
  border-style: solid;
  border-width: 5px;
}

p.two {
  border-style: solid;
  border-width: medium;
}

p.three {
  border-style: dotted;
  border-width: 2px;
}

p.four {
  border-style: dotted;
  border-width: thick;
}
```

![border-width](./css-resource/border-width.png)

```css
p.one {
  border-style: solid;
  border-width: 5px 20px; /* 5px top and bottom, 20px on the sides */
}

p.two {
  border-style: solid;
  border-width: 20px 5px; /* 20px top and bottom, 5px on the sides */
}

p.three {
  border-style: solid;
  border-width: 25px 10px 4px 35px; /* 25px top, 10px right, 4px bottom and 35px left */
}
```

### Border Color

```css
p.one {
  border-style: solid;
  border-color: red;
}

p.two {
  border-style: solid;
  border-color: green;
}

p.three {
  border-style: dotted;
  border-color: blue;
}
```

```css
p.one {
  border-style: solid;
  border-color: red green blue yellow; /* red top, green right, blue bottom and yellow left */
}
```

### Border Sides

```css
p {
  border-top-style: dotted;
  border-right-style: solid;
  border-bottom-style: dotted;
  border-left-style: solid;
}
```

```css
p {
  border-style: dotted solid;
}
```

```css
/* Four values */
p.four {
  border-style: dotted solid double dashed;
}

/* Three values */
p.three {
  border-style: dotted solid double;
}

/* Two values */
p.two {
  border-style: dotted solid;
}

/* One value */
p.one {
  border-style: dotted;
}
```

![border-sides](./css-resource/border-sides.png)

### Shorthand Border Property

#### 순서

 - border-width
 - border-style (required)
 - border-color

```css
p {
  border: 5px solid red;
}
```

```css
p {
  border-left: 6px solid red;
  background-color: lightgrey;
}
```

```css
p {
  border-bottom: 6px solid red;
  background-color: lightgrey;
}
```

### Rounded Borders

```css
p {
  border: 2px solid red;
  border-radius: 5px; /*높을 수록 모서리가 더 둥글해짐*/
}
```

<br><br><br><br><br>
<br><br><br><br><br>


## 7. Margins

```css
p {
  margin-top: 100px;
  margin-bottom: 100px;
  margin-right: 150px;
  margin-left: 80px;
}
```

```css
p {
  margin: 25px 50px 75px 100px;
}
```

- top margin is 25px
- right margin is 50px
- bottom margin is 75px
- left margin is 100px

```css
p {
  margin: 25px 50px 75px;
}
```
 - top margin is 25px
 - right and left margins are 50px
 - bottom margin is 75px

```css
p {
  margin: 25px 50px;
}
```
 - top and bottom margins are 25px
 - right and left margins are 50px

```css
p {
  margin: 25px;
}
```
 - all four margins are 25px

### Auto Value

```css
div {
  width: 300px;
  margin: auto;
  border: 1px solid red;
}
```

### Inherit Value

```css
div {
  border: 1px solid red;
  margin-left: 100px;
}

p.ex1 {
  margin-left: inherit;
}
```

## 8. Padding

```css
div {
  padding-top: 50px;
  padding-right: 30px;
  padding-bottom: 50px;
  padding-left: 80px;
}
```

```css
div {
  padding: 25px 50px 75px 100px;
}
```
 - top padding is 25px
 - right padding is 50px
 - bottom padding is 75px
 - left padding is 100px

```css
div {
  padding: 25px 50px 75px;
}
```
 - top padding is 25px
 - right and left paddings are 50px
 - bottom padding is 75px

```css
div {
  padding: 25px 50px;
}
```
 - top and bottom paddings are 25px
 - right and left paddings are 50px

```css
div {
  padding: 25px;
}
```
 - all four paddings are 25px


### Padding and Element Width

```css
div.ex1 {
  width: 300px;
  background-color: yellow;
}

div.ex2 {
  width: 300px;
  padding: 25px;
  background-color: lightblue;
}
```
 - Use the box-sizing property to keep the width at 300px, no matter the amount of padding:
```css
div {
  width: 300px;
  padding: 25px;
  box-sizing: border-box;
}
```

## 9. Height and Width

### Values

 - auto - This is default. The browser calculates the height and width
 - length - Defines the height/width in px, cm etc.
 - % - Defines the height/width in percent of the containing block
 - initial - Sets the height/width to its default value
 - inherit - The height/width will be inherited from its parent value


#### 폭이 줄어들면 안보인다.

```css
div {
  width: 500px;
  height: 100px;
  background-color: powderblue;
}
```

#### 보이게 하자

```css
div {
  max-width: 500px;
  height: 100px;
  background-color: powderblue;
}
```

## 10. Outline

### `outline-style`

```css
p.dotted {outline-style: dotted;}
p.dashed {outline-style: dashed;}
p.solid {outline-style: solid;}
p.double {outline-style: double;}
p.groove {outline-style: groove;}
p.ridge {outline-style: ridge;}
p.inset {outline-style: inset;}
p.outset {outline-style: outset;}
```

### `outline-width`, `outline-color`

```css
p.ex1 {
  border: 1px solid black;
  outline-style: solid;
  outline-color: red;
  outline-width: thin;
}

p.ex2 {
  border: 1px solid black;
  outline-style: solid;
  outline-color: red;
  outline-width: medium;
}

p.ex3 {
  border: 1px solid black;
  outline-style: solid;
  outline-color: red;
  outline-width: thick;
}

p.ex4 {
  border: 1px solid black;
  outline-style: solid;
  outline-color: red;
  outline-width: 4px;
}
```

### Shorthand property

 - outline-width
 - outline-style (required)
 - outline-color

```css
p.ex1 {outline: dashed;}
p.ex2 {outline: dotted red;}
p.ex3 {outline: 5px solid yellow;}
p.ex4 {outline: thick ridge pink;}
```

### `outline-offset`

This property adds space between an outline and the edge/border of an element

## 11.Text

### Color

```css
h1 {
  background-color: black;
  color: white;
}
```

### Alignment

```css
h1 {
  text-align: center;
}

h2 {
  text-align: left;
}

h3 {
  text-align: right;
}
```

### Direction

The `direction` and `unicode-bidi` properties can be used to change the text direction of an element:

```html
<!DOCTYPE html>
<html>
<head>
<style>
p.ex1 {
  direction: rtl;
  unicode-bidi: bidi-override;
}
</style>
</head>
<body>

<p>This is the default text direction.</p>

<p class="ex1">This is right-to-left text direction.</p>

</body>
</html>
```

### Vertical

```css
img.top {
  vertical-align: top;
}

img.middle {
  vertical-align: middle;
}

img.bottom {
  vertical-align: bottom;
}
```

### Decoration

```css
h1 {
  text-decoration: overline;
}

h2 {
  text-decoration: line-through;
}

h3 {
  text-decoration: underline;
}
```

### Transformation

```css
p.uppercase {
  text-transform: uppercase;
}

p.lowercase {
  text-transform: lowercase;
}

p.capitalize {
  text-transform: capitalize;
}
```

### Spacing

 - indent

```css
p {
  text-indent: 50px;
}
```

 - 자간 공간

```css
h1 {
  letter-spacing: 3px;
}

h2 {
  letter-spacing: -3px;
}
```

 - 글간 공간

```css
p.small {
  line-height: 0.8;
}

p.big {
  line-height: 1.8;
}
```

 - 단어간 공간

```css
h1 {
  word-spacing: 10px;
}

h2 {
  word-spacing: -5px;
}
```

 - 공백 다루기(handle)

```html
<!DOCTYPE html>
<html>
<head>
<style>
p {
  white-space: nowrap;
}
</style>
</head>
<body>

<h2>White Space</h2>

<p>
This is some text. This is some text. This is some text.
This is some text. This is some text. This is some text.
This is some text. This is some text. This is some text.
This is some text. This is some text. This is some text.
This is some text. This is some text. This is some text.
</p>

<p>Try to remove the white-space property to see the difference.</p>

</body>
</html>
```

### Shadow

 - horizontal shadow (2px) and the vertical shadow (2px):

```css
h1 {
  text-shadow: 2px 2px red;
}
```

 - blur effect (5px) to the shadow:

```css
h1 {
  text-shadow: 2px 2px 5px red;
}
```

## 12. Font

 - If the font name is more than one word, it must be in quotation marks, like: "Times New Roman".

 - The second and third fonts are backups, in case the first one is not found.

```css
.p1 {
  font-family: "Times New Roman", Times, serif;
}

.p2 {
  font-family: Arial, Helvetica, sans-serif;
}

.p3 {
  font-family: "Lucida Console", "Courier New", monospace;
}
```

### Style

 - `font-style`

```css
p.normal {
  font-style: normal;
}

p.italic {
  font-style: italic;
}

p.oblique {
  font-style: oblique;
}
```

 - `font-weight`

```css
p.normal {
  font-weight: normal;
}

p.thick {
  font-weight: bold;
}
```

 - `font-variant`

```css
p.normal {
  font-variant: normal;
}

p.small {
  font-variant: small-caps;
}
```

### Size

```css
h1 {
  font-size: 40px;
}

h1 {
  font-size: 2.5em; /* 40px/16=2.5em */
}

body {
  font-size: 100%;
}
```

The text size can be set with a vw unit, which means the "viewport width".

That way the text size will follow the size of the browser window:

```html
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<body>

<h1 style="font-size:10vw;">Responsive Text</h1>

<p style="font-size:5vw;">Resize the browser window to see how the text size scales.</p>

<p style="font-size:5vw;">Use the "vw" unit when sizing the text. 10vw will set the size to 10% of the viewport width.</p>

<p>Viewport is the browser window size. 1vw = 1% of viewport width. If the viewport is 50cm wide, 1vw is 0.5cm.</p>

</body>
</html>
```

Viewport is the browser window size. 1vw = 1% of viewport width. If the viewport is 50cm wide, 1vw is 0.5cm.

### shorthand
 - font-style
 - font-variant
 - font-weight
 - font-size/line-height
 - font-family

```css
p.a {
  font: 20px Arial, sans-serif;
}

p.b {
  font: italic small-caps bold 12px/30px Georgia, serif;
}
```

## 13. Icon

```html
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>

<i class="material-icons">cloud</i>
<i class="material-icons">favorite</i>
<i class="material-icons">attachment</i>
<i class="material-icons">computer</i>
<i class="material-icons">traffic</i>

</body>
</html>
```

## 14. Link

 - color로 꾸미기

```css
/* unvisited link */
a:link {
  color: red;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: hotpink;
}

/* selected link */
a:active {
  color: blue;
}
```

 - text-decoration으로 꾸미기

```css
a:link {
  text-decoration: none;
}

a:visited {
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}

a:active {
  text-decoration: underline;
}
```

## 15. list

```css
ul.a {
  list-style-type: circle;
}

ul.b {
  list-style-type: square;
}

ol.c {
  list-style-type: upper-roman;
}

ol.d {
  list-style-type: lower-alpha;
}
```

```css
ul {
  list-style-image: url('sqpurple.gif');
}
```

```html
<!DOCTYPE html>
<html>
<head>
<style>
ul.a {
  list-style-position: outside;
}

ul.b {
  list-style-position: inside;
}
</style>
</head>
<body>

<h1>The list-style-position Property</h1>

<h2>list-style-position: outside (default):</h2>
<ul class="a">
  <li>Coffee - A brewed drink prepared from roasted coffee beans, which are the seeds of berries from the Coffea plant</li>
  <li>Tea - An aromatic beverage commonly prepared by pouring hot or boiling water over cured leaves of the Camellia sinensis, an evergreen shrub (bush) native to Asia</li>
  <li>Coca Cola - A carbonated soft drink produced by The Coca-Cola Company. The drink's name refers to two of its original ingredients, which were kola nuts (a source of caffeine) and coca leaves</li>
</ul>

<h2>list-style-position: inside:</h2>
<ul class="b">
  <li>Coffee - A brewed drink prepared from roasted coffee beans, which are the seeds of berries from the Coffea plant</li>
  <li>Tea - An aromatic beverage commonly prepared by pouring hot or boiling water over cured leaves of the Camellia sinensis, an evergreen shrub (bush) native to Asia</li>
  <li>Coca Cola - A carbonated soft drink produced by The Coca-Cola Company. The drink's name refers to two of its original ingredients, which were kola nuts (a source of caffeine) and coca leaves</li>
</ul>

</body>
</html>
```

### Remove Default Settings

```css
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}
```

### Shorthand property

 - list-style-type
 - list-style-position
 - list-style-image 

```css
ul {
  list-style: square inside url("sqpurple.gif");
}
```

## 16. Table

### border and size

The border-collapse property sets whether the table borders should be collapsed into a single border:

```html
<!DOCTYPE html>
<html>
<head>
<style>
table, td, th {
  border: 1px solid black;
}

table {
  width: 100%;
  border-collapse: collapse;
}
</style>
</head>
<body>

<h2>Let the borders collapse</h2>

<table>
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
  </tr>
  <tr>
    <td>Peter</td>
    <td>Griffin</td>
  </tr>
  <tr>
    <td>Lois</td>
    <td>Griffin</td>
  </tr>
</table>

</body>
</html>
```

### Alignment

```css
td {
  height: 50px;
  vertical-align: bottom;
}
```

### Style

 - For zebra-striped tables, use the nth-child() selector and add a background-color to all even (or odd) table rows:

```html
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body>

<h2>Striped Table</h2>
<p>For zebra-striped tables, use the nth-child() selector and add a background-color to all even (or odd) table rows:</p>

<table>
  <tr>
  <th>First Name</th>
  <th>Last Name</th>
  <th>Points</th>
  </tr>
  <tr>
  <td>Peter</td>
  <td>Griffin</td>
  <td>$100</td>
  </tr>
  <tr>
  <td>Lois</td>
  <td>Griffin</td>
  <td>$150</td>
  </tr>
  <tr>
  <td>Joe</td>
  <td>Swanson</td>
  <td>$300</td>
  </tr>
  <tr>
  <td>Cleveland</td>
  <td>Brown</td>
  <td>$250</td>
  </tr>
</table>

</body>
</html>
```

### Responsive Table

`<div style="overflow-x:auto;">`

```html
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body>

<h2>Responsive Table</h2>
<p>A responsive table will display a horizontal scroll bar if the screen is too 
small to display the full content. Resize the browser window to see the effect:</p>
<p>To create a responsive table, add a container element (like div) with <strong>overflow-x:auto</strong> around the table element:</p>

<div style="overflow-x:auto;">
  <table>
    <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
      <th>Points</th>
    </tr>
    <tr>
      <td>Jill</td>
      <td>Smith</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
      <td>50</td>
    </tr>
    <tr>
      <td>Eve</td>
      <td>Jackson</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
      <td>94</td>
    </tr>
    <tr>
      <td>Adam</td>
      <td>Johnson</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
      <td>67</td>
    </tr>
  </table>
</div>

</body>
</html>
```