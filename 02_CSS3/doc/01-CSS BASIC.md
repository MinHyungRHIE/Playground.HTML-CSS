# CSS3

## 기본 숙지 사항
 - Cascading Style Sheets (CSS) is used to format the layout of a webpage.
 - With CSS, you can control the color, font, the size of text, the spacing between elements, how elements are positioned and laid out, what background images or background colors to be used, different displays for different devices and screen sizes, and much more!

### Inline CSS
by using the style attribute inside HTML elements
```html
<h1 style="color:blue;">A Blue Heading</h1>
<p style="color:red;">A red paragraph.</p>
```
### Internal CSS
```html
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```
by using a \<style> element in the \<head> section
### External CSS
by using a \<link> element to link to an external CSS file
```html
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>
<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
```

```css
# styles.css 파일
body {
  background-color: powderblue;
}
h1 {
  color: blue;
}
p {
  color: red;
}
```

## 주요 내용

### CSS Colors, Fonts and Sizes
The CSS <span style="color:red">`color`</span> property defines the text color to be used.

The CSS <span style="color:red">`font-family`</span> property defines the font to be used.

The CSS <span style="color:red">`font-size`</span>  property defines the text size to be used.
```css
p  {
  color: red;
  font-family: courier;
  font-size: 160%;
}
```
### CSS Border
```css
p {
  border: 2px solid powderblue;
}
```
### CSS Padding
The CSS padding property defines a padding (space) between the text and the border.

```css
p {
  border: 2px solid powderblue;
  padding: 30px;
}
```
### CSS Margin
The CSS margin property defines a margin (space) outside the border.

```css
p {
  border: 2px solid powderblue;
  margin: 50px;
}
```
### Link to External CSS
External style sheets can be referenced with a full URL or with a path relative to the current web page.
```html
<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">
```

This example links to a style sheet located in the same folder as the current page:
```html
<link rel="stylesheet" href="styles.css">
```