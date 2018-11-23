# React Native Zxing [![npm version](https://badge.fury.io/js/react-native-zxing.svg)](http://badge.fury.io/js/react-native-zxing) [![npm downloads](https://img.shields.io/npm/dm/react-native-zxing.svg)](https://www.npmjs.com/package/react-native-zxing)

The comprehensive zxing module for React Native (Android). 

This module abstracts the library `zxing-android-embedded`, developed by JourneyApps

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

![5j2jduk](https://gph.is/2BsvEAn)

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

var barcodeTypes ['QR_CODE', 'DATA_MATRIX']
ScannerModule.openScanner(true, true, barcodeTypes, this.onBarcodeRead)
``` 


------------

Thanks to JourneyApps for the `zxing-android-embedded` library which I used to access Zxing library.