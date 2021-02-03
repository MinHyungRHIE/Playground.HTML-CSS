# CSS Property

## color
```html
<h1 style="color:DodgerBlue;">Hello World</h1>
<h1 style="color:rgba(255, 99, 71, 0);;">Hello World</h1>
<h1 style="color:#ffa500;">Hello World</h1>
<h1 style="color:hsl(147, 50%, 47%);">Hello World</h1>
```
## background
 - background-color
 - background-image
 - background-repeat
 - background-attachment
 - background-position

### `background-color`
```css
div {
  background-color: green;
  opacity: 0.3;
}
`
```

### `background-image`
```css
body {
  background-image: url("bgdesert.jpg");
}
```

### `background-repeat`
By default, the background-image property repeats an image both horizontally and vertically.

If the image is repeated only horizontally (`background-repeat: repeat-x;`), the background will look better:
```css
body {
  background-image: url("gradient_bg.png");
  background-repeat: repeat-x;
}
```

Showing the background image only once is also specified by the background-repeat property:

```css
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
}
```