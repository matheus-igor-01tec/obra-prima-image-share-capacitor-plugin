import { registerPlugin } from '@capacitor/core';
const OpImageShare = registerPlugin('OpImageShare', {
    web: () => import('./web').then((m) => new m.OpImageShareWeb()),
});
export * from './definitions';
export { OpImageShare };
//# sourceMappingURL=index.js.map