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


### Interfaces


#### SavePictureOptions

| Prop           | Type                |
| -------------- | ------------------- |
| **`album` (optional)**    | <code>string</code> |
| **`filename`** | <code>string</code> |
| **`path`**     | <code>string</code> |


#### SavePictureResult

| Prop      | Type                |
| --------- | ------------------- |
| **`uri`** | <code>string</code> |

</docgen-api>
