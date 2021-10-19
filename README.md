# @agorapulse/capacitor-mediastore

Manage Android media files

## Install

```bash
npm install @agorapulse/capacitor-mediastore
npx cap sync
```

## API

<docgen-index>

* [`savePicture(...)`](#savepicture)
* [`saveToDownloads(...)`](#savetodownloads)
* [`saveVideo(...)`](#savevideo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### savePicture(...)

```typescript
savePicture(options: SavePictureOptions) => any
```

| Param         | Type                                                              |
| ------------- | ----------------------------------------------------------------- |
| **`options`** | <code><a href="#savepictureoptions">SavePictureOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### saveToDownloads(...)

```typescript
saveToDownloads(options: SaveToDownloadsOptions) => any
```

| Param         | Type                                                                      |
| ------------- | ------------------------------------------------------------------------- |
| **`options`** | <code><a href="#savetodownloadsoptions">SaveToDownloadsOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### saveVideo(...)

```typescript
saveVideo(options: SaveVideoOptions) => any
```

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#savevideooptions">SaveVideoOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### SavePictureOptions

| Prop           | Type                |
| -------------- | ------------------- |
| **`album`**    | <code>string</code> |
| **`filename`** | <code>string</code> |
| **`path`**     | <code>string</code> |


#### SavePictureResult

| Prop      | Type                |
| --------- | ------------------- |
| **`uri`** | <code>string</code> |


#### SaveToDownloadsOptions

| Prop           | Type                |
| -------------- | ------------------- |
| **`filename`** | <code>string</code> |
| **`path`**     | <code>string</code> |


#### SaveToDownloadsResult

| Prop      | Type                |
| --------- | ------------------- |
| **`uri`** | <code>string</code> |


#### SaveVideoOptions

| Prop           | Type                |
| -------------- | ------------------- |
| **`album`**    | <code>string</code> |
| **`filename`** | <code>string</code> |
| **`path`**     | <code>string</code> |


#### SaveVideoResult

| Prop      | Type                |
| --------- | ------------------- |
| **`uri`** | <code>string</code> |

</docgen-api>
