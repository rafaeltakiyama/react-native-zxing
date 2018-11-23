# React Native Zxing [![npm version](https://badge.fury.io/js/react-native-zxing.svg)](http://badge.fury.io/js/react-native-zxing) [![npm downloads](https://img.shields.io/npm/dm/react-native-zxing.svg)](https://www.npmjs.com/package/react-native-zxing)

The comprehensive zxing module for React Native (Android). 

This module abstracts the library [`zxing-android-embedded`](https://github.com/journeyapps/zxing-android-embedded), developed by [JourneyApps](https://github.com/journeyapps)

Barcode formats:

- UPC A
- UPC E
- EAN 8
- EAN 13
- RSS 14
- CODE 39
- CODE 93
- CODE 128
- ITF
- RSS EXPANDED
- QR CODE
- DATA MATRIX
- PDF 417

![Example](https://media.giphy.com/media/1wpxKD8tXU3eXXC8Hi/giphy.gif)

### Example import

```jsx
import {NativeModules} from 'react-native';

const ScannerModule = NativeModules.ScannerModule;
```

## Getting started

### Mostly automatic install with react-native
1. `npm install react-native-zxing --save`
2. `react-native link react-native-zxing`

## Usage

```javascript
// boolean isBeepEnable
// boolean isOrientationLocked
// ReadableArray barcodeTypes (If you want all barcode types, pass null)
// Callback callback 

onBarcodeRead = (barcode) => {
    //do something with barcode value
}

var barcodeTypes [
    'QR_CODE', 
    'DATA_MATRIX', 
    'UPC_A', 
    'UPC_E',
    'EAN_8',
    'EAN_13',
    'RSS_14',
    'CODE_39',
    'CODE_93',
    'CODE_128',
    'ITF',
    'RSS_EXPANDED',
    'QR_CODE',
    'DATA_MATRIX',
    'PDF_417'
]
ScannerModule.openScanner(true, true, barcodeTypes, this.onBarcodeRead)
``` 


------------

Thanks to JourneyApps for the `zxing-android-embedded` library which I used to access Zxing library.


## License

    The MIT License (MIT)

    Copyright (c) 2018 Rafael T Akiyama

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.