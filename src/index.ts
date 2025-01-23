import { registerPlugin } from '@capacitor/core';

import type { OpImageSharePlugin } from './definitions';

const OpImageShare = registerPlugin<OpImageSharePlugin>('OpImageShare', {
  web: () => import('./web').then((m) => new m.OpImageShareWeb()),
});

export * from './definitions';
export { OpImageShare };
