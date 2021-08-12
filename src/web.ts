import { WebPlugin } from '@capacitor/core';

import type { MediastorePlugin } from './definitions';

export class MediastoreWeb extends WebPlugin implements MediastorePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
