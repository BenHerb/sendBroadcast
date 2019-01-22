
# react-native-send-broadcast

## Getting started

`$ npm install react-native-send-broadcast --save`

### Mostly automatic installation

`$ react-native link react-native-send-broadcast`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-send-broadcast` and add `RNSendBroadcast.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSendBroadcast.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSendBroadcastPackage;` to the imports at the top of the file
  - Add `new RNSendBroadcastPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-send-broadcast'
  	project(':react-native-send-broadcast').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-send-broadcast/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-send-broadcast')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSendBroadcast.sln` in `node_modules/react-native-send-broadcast/windows/RNSendBroadcast.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Send.Broadcast.RNSendBroadcast;` to the usings at the top of the file
  - Add `new RNSendBroadcastPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSendBroadcast from 'react-native-send-broadcast';

// TODO: What to do with the module?
RNSendBroadcast;
```
  