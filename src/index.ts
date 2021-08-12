import { registerPlugin } from '@capacitor/core';

import type { MediastorePlugin } from './definitions';

const Mediastore = registerPlugin<MediastorePlugin>('Mediastore', {
  web: () => import('./web').then(m => new m.MediastoreWeb()),
});

export * from './definitions';
export { Mediastore };
