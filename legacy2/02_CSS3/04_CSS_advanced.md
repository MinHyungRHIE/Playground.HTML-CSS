# 💻 CSS 업그레이드

## 1. 굴곡

```css
#rcorners1 {
  border-radius: 15px 50px 30px 5px;
  background: #73AD21;
  padding: 20px; 
  width: 200px;
  height: 150px; 
}

#rcorners2 {
  border-radius: 15px 50px 30px;
  background: #73AD21;
  padding: 20px; 
  width: 200px;
  height: 150px; 
}

#rcorners3 {
  border-radius: 15px 50px;
  background: #73AD21;
  padding: 20px; 
  width: 200px;
  height: 150px; 
} 

#rcorners4 {
  border-radius: 15px;
  background: #73AD21;
  padding: 20px; 
  width: 200px;
  height: 150px; 
} 
```

```css
#circle{
    border-radius: 50%;
}
```

 - border-radius	A shorthand property for setting all the four border-*-*-radius properties
 - border-top-left-radius	Defines the shape of the border of the top-left corner
 - border-top-right-radius	Defines the shape of the border of the top-right corner
 - border-bottom-right-radius	Defines the shape of the border of the bottom-right corner
 - border-bottom-left-radius

## 2. 그라데이션

### Linear

#### top to bottom (default)

```css
#grad {
  background-image: linear-gradient(red, yellow);
}
```

#### Left to Right

```css
#grad {
  background-image: linear-gradient(to right, red , yellow);
}
```

```css
#grad {
  background-image: linear-gradient(to bottom right, red, yellow);
}
```

#### Multi

```css
#grad {
  background-image: linear-gradient(to right, red,orange,yellow,green,blue,indigo,violet);
}
```

### Radial

#### 안에서 밖으로

```css
#grad {
  background-image: radial-gradient(red, yellow, green);
}
```

```css
#grad {
  background-image: radial-gradient(red 5%, yellow 15%, green 60%);
}
```

## 3. Text, box 그림자


### horizontal shadow (2px) and the vertical shadow (2px):

```css
h1 {
  text-shadow: 2px 2px red;
}
```

### blur

```css
h1 {
  text-shadow: 2px 2px 5px red;
}
```

 - box

```css
div {
  box-shadow: 10px 10px 5px grey;
}
```

## 4. Text Overflow

```html
<!DOCTYPE html>
<html>
<head>
<style> 
p.test1 {
  white-space: nowrap; 
  width: 200px; 
  border: 1px solid #000000;
  overflow: hidden;
  text-overflow: clip;
}

p.test2 {
  white-space: nowrap; 
  width: 200px; 
  border: 1px solid #000000;
  overflow: hidden;
  text-overflow: ellipsis;
}
</style>
</head>
<body>

<h1>The text-overflow Property</h1>
<p>The following two paragraphs contains a long text that will not fit in the box.</p>

<h2>text-overflow: clip:</h2>
<p class="test1">This is some long text that will not fit in the box</p>

<h2>text-overflow: ellipsis:</h2>
<p class="test2">This is some long text that will not fit in the box</p>

</body>
</html>
```

## 5. 2D Transform

```css
div {
  transform: translate(50px, 100px);
}
```

```css
div {
  transform: rotate(20deg);
}
```

<br><br>

```css
div {
  transform: scale(2, 3);
}
```
x, y 존재

<br><br>

```css
div {
  transform: skew(20deg, 10deg);
}
```
x, y 존재


<br><br>

 - The matrix() method combines all the 2D transform methods into one.

 - The parameters are as follow: matrix(scaleX(),skewY(),skewX(),scaleY(),translateX(),translateY())

```css
div {
  transform: matrix(1, -0.3, 0, 1, 0, 0);
}
```

## 6. 3D Transform

```css
#myDiv {
  transform: rotateX(150deg);
}
```

```css
#myDiv {
  transform: rotateY(130deg);
}
```

```css
#myDiv {
  transform: rotateZ(90deg); /*transform: rotate(90deg);*/
}
```

## 7. Transition

```css
div {
  width: 100px;
  height: 100px;
  background: red;
  transition: width 2s;
}

div:hover {
  width: 300px;
}
```

```css
div {
  transition: width 2s, height 4s;
}
```

### 미세 속도 조절

 - ease - specifies a transition effect with a slow start, then fast, then end slowly (this is  default)
 - linear - specifies a transition effect with the same speed from start to end
 - ease-in - specifies a transition effect with a slow start
 - ease-out - specifies a transition effect with a slow end
 - ease-in-out - specifies a transition effect with a slow start and end
 - cubic-bezier(n,n,n,n) - lets you define your own values in a cubic-bezier function

```css
#div1 {transition-timing-function: linear;}
#div2 {transition-timing-function: ease;}
#div3 {transition-timing-function: ease-in;}
#div4 {transition-timing-function: ease-out;}
#div5 {transition-timing-function: ease-in-out;}
```

### 반응속도

 -`transition-delay: 1s;`

```css
div {
  width: 100px;
  height: 100px;
  background: red;
  transition: width 3s;
  transition-delay: 1s;
}

div:hover {
  width: 300px;
}
```

## 8. 애니메이션

### `@keyframes Rule`

```html
<!DOCTYPE html>
<html>
<head>
<style> 
div {
  width: 100px;
  height: 100px;
  background-color: red;
  animation-name: example;
  animation-duration: 2s;
}

@keyframes example {
  from {background-color: red;}
  to {background-color: yellow;}
}
</style>
</head>
<body>

<p><b>Note:</b> This example does not work in Internet Explorer 9 and earlier versions.</p>

<div></div>

<p><b>Note:</b> When an animation is finished, it changes back to its original style.</p>

</body>
</html>

```

```css
<!DOCTYPE html>
<html>
<head>
<style>
div {
  width: 100px;
  height: 100px;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color: red;}
  25%  {background-color: yellow;}
  50%  {background-color: blue;}
  100% {background-color: green;}
}
</style>
</head>
<body>

<p><b>Note:</b> This example does not work in Internet Explorer 9 and earlier versions.</p>

<div></div>

</body>
</html>
```

```html
<!DOCTYPE html>
<html>
<head>
<style> 
div {
  width: 100px;
  height: 100px;
  background-color: red;
  position: relative;
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color:red; left:0px; top:0px;}
  25%  {background-color:yellow; left:200px; top:0px;}
  50%  {background-color:blue; left:200px; top:200px;}
  75%  {background-color:green; left:0px; top:200px;}
  100% {background-color:red; left:0px; top:0px;}
}
</style>
</head>
<body>

<p><b>Note:</b> This example does not work in Internet Explorer 9 and earlier versions.</p>

<div></div>

</body>
</html>
```

 - delay

```css
div {
  width: 100px;
  height: 100px;
  position: relative;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
  animation-delay: 2s;
}
```

 - 반복

```css
div {
  width: 100px;
  height: 100px;
  position: relative;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
  animation-iteration-count: 3;
}
```

```css
div {
  width: 100px;
  height: 100px;
  position: relative;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
  animation-iteration-count: infinite;
}
```

 - 반대로 재생

```css
animation-direction: reverse;  
```

 - 정상 재생후 돌아가기

```css
animation-direction: alternate;
```

 - `alternate`의 반대

```css
animation-direction: alternate-reverse; 
```

### 최종

```html
<!DOCTYPE html>
<html>
<head>
<style> 
div {
  width: 100px;
  height: 50px;
  background-color: red;
  font-weight: bold;
  position: relative;
  animation: mymove 5s infinite;
}

#div1 {animation-timing-function: linear;}
#div2 {animation-timing-function: ease;}
#div3 {animation-timing-function: ease-in;}
#div4 {animation-timing-function: ease-out;}
#div5 {animation-timing-function: ease-in-out;}

@keyframes mymove {
  from {left: 0px;}
  to {left: 300px;}
}
</style>
</head>
<body>

<p><strong>Note:</strong> The animation-timing-funtion property is not supported in Internet Explorer 9 and earlier versions.</p>

<div id="div1">linear</div>
<div id="div2">ease</div>
<div id="div3">ease-in</div>
<div id="div4">ease-out</div>
<div id="div5">ease-in-out</div>

</body>
</html>
```

