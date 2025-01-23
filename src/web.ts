import { WebPlugin } from '@capacitor/core';

import type { OpImageSharePlugin } from './definitions';

export class OpImageShareWeb extends WebPlugin implements OpImageSharePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
