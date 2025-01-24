# obra-prima-image-share-capacitor-plugin

Plugin customizado para realizar integração da galeria para o aplicativo

## Install

```bash
npm install obra-prima-image-share-capacitor-plugin
npx cap sync
```

## API

<docgen-index>

* [`addListener('imageReceived', ...)`](#addlistenerimagereceived-)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addListener('imageReceived', ...)

```typescript
addListener(eventName: 'imageReceived', listenerFunc: (data: { imageUri: string; }) => void) => Promise<{ remove: () => void; }>
```

| Param              | Type                                                  |
| ------------------ | ----------------------------------------------------- |
| **`eventName`**    | <code>'imageReceived'</code>                          |
| **`listenerFunc`** | <code>(data: { imageUri: string; }) =&gt; void</code> |

**Returns:** <code>Promise&lt;{ remove: () =&gt; void; }&gt;</code>

--------------------

</docgen-api>
