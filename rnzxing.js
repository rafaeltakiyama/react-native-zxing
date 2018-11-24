/**
 * @providesModule react-native-device-info
 */
import { NativeModules } from 'react-native'

const ScannerModule = NativeModules.ScannerModule

export default {
  openScanner: function () {
    return ScannerModule.openScanner
  },

  openCustomScanner: function () {
    return ScannerModule.openCustomScanner
  }
}
