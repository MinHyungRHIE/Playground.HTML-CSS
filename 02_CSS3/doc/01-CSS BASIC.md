# CSS3

## 기본 숙지 사항
 - Cascading Style Sheets (CSS) is used to format the layout of a webpage.
 - With CSS, you can control the color, font, the size of text, the spacing between elements, how elements are positioned and laid out, what background images or background colors to be used, different displays for different devices and screen sizes, and much more!

### CSS Syntax
```css
p {
  color: red;
  text-align: center;
}
```
여기서 p는 `Selector`

color: red;는 `Declaration`

color는 `Property`

blue는 `Value`

### Selector 요소 뽑기
- 태그
```css
p {
  text-align: center;
  color: red;
}
```
- id
```css
#para1 {
  text-align: center;
  color: red;
}
```
- class
```css
.center {
  text-align: center;
  color: red;
}
```
- 특정 태그안에 있는 class만 먹이기
```css
p.center {
  text-align: center;
  color: red;
}
```
- HTML에 여러 클래스 먹이기

In this example the \<p> element will be styled according to class="center" and to class="large": 
```html
<p class="center large">This paragraph refers to two classes.</p>
```
- Universal Selector
```css
* {
  text-align: center;
  color: blue;
}
```
- Grouping Selector
```css
h1 {
  text-align: center;
  color: red;
}

h2 {
  text-align: center;
  color: red;
}

p {
  text-align: center;
  color: red;
}
```
It will be better to group the selectors, to minimize the code.

To group selectors, separate each selector with a comma.
```css
h1, h2, p {
  text-align: center;
  color: red;
}
```

### Inline CSS
by using the style attribute inside HTML elements
```html
<h1 style="color:blue;">A Blue H eading</h1>
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

### 주석 달기
```css
p {
  color: red;  /* Set text color to red */
}
```
```html
<!DOCTYPE html>
<html>
<head>
<style>
p {
  color: red; /* Set text color to red */
}
</style>
</head>
<body>

<h2>My Heading</h2>

<!-- These paragraphs will be red -->
<p>Hello World!</p>
<p>This paragraph is styled with CSS.</p>
<p>CSS comments are not shown in the output.</p>

</body>
</html>
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

## CSS 선택자 우선순위

1. 속성값 뒤의 !important 

2. 태그에 inline으로 style 속성 지정

3. 선택자가 #id

4. 선택자가 .class 및 pseudo 클래스(:hover같은 것)

5. 선택자가 tag 이름

인라인 스타일 1000점

ID 선택자 100점

클래스 선택자 및 가상 클래스(:before 같은), 속성 10점

태그 선택자 1점

```css
* {

} /* a=0 b=0 c=0 d=0 => 0점 */
ul {
} /* a=0 b=0 c=0 d=1 => 1점 (태그)*/

li:first-child {
} /* a=0 b=0 c=1 d=1 => 11점 (pseudo-class, 태그)*/

ul li {
} /* a=0 b=0 c=0 d=2 => 2점 (2태그)*/

ul ol .red-tag {
} /* a=0 b=0 c=1 d=2 => 12점 (1클래스 2태그) */

#blue-tag {
} /* a=0 b=1 c=0 d=0 => 100점 (1아이디)*/
```

또한 개수마저 같다면 태그와 같은 경우는 \<style> 태그나 CSS 파일에서 나중에 나온 것이 class나 id 지정자 같은 경우 태그에 먼저 나온 것이 우선순위를 가져갑니다.

### 하나의 CSS 파일로 관리하는 건 bad choice
각 사이트 마다 적용되는 CSS는 다를 것인데 만일 하나의 CSS로 많은 페이지를 한번에 관리하게 된다면 해당 웹사이트에 접속하는 이용자는 방대한 용량의 CSS파일을 내려받는 지연 시간이 발생하게 된다.

그래서 효율적인 페이지를 위해 각 페이지에 맞는 스타일 시트로 관리하는 것이 좋다.

그렇다고 무조건 나누는 것이 좋은 것은 아니다. 관리적 측면에서는 좋을지 모르겠지만 속도가 감소되기 때문이다.

*웹 브라우저가 파일들을 다운로드 받기 위해서는 먼저 서버에 파일을 요청해야 합니다. 문제는 이렇게 서버에 요청하는 것 역시, 무시하지 못 할 시간을 소요하게 됩니다. 때문에 같은 총 용량을 가졌더라도, 하나의 파일을 받는 것과 여러 개의 파일을 받는 것 중, 하나의 파일을 받는 것이 더 빠릅니다. (이런 이유로, 웹 페이지를 최적화 할 때 여러 이미지를 하나로 합치기도 합니다.) 그렇기 때문에, 무의미할 정도에 시트 분할은 오히려 속도에 악영향을 주게 됩니다.*

이 스타일 시트를 나누는 것에 정답이 있는 것은 아닙니다. 예를 들어 만약 본문 페이지에 방문 했더라도, 대부분 그 다음 다른 페이지에 접속을 하게 된다면, 오히려 그 두 개의 페이지의 스타일 시트를 하나로 만드는 것이 더 나을 수도 있는 것입니다. 이 부분은 여러분들이 작업을 해보고 고민해 보면서 자연스럽게 작업하게 될 것입니다.

### @import 보단 link를 사용하자
바로 웹 페이지의 로딩 속도를 늦추기 때문입니다. 

기본적으로 웹 페이지에 접속하면, 일단 웹 브라우저는 html 파일이나, css 파일 이미지 등을 다운 받습니다. 보통 로딩의 상당 수는 이렇게 해당 파일들을 다운 받는데 소모 됩니다. 

여기서 link와 @import간의 차이점이 발견되는데, link를 사용할 경우 파일을 병렬로 같이 받습니다. (다운로드의 요청이 거의 동시에 이루어 집니다.) 

하지만 @import의 경우 우선 link된 파일을 받고, 그 다음 안에 @import된 스타일 시트를 받게 됩니다.