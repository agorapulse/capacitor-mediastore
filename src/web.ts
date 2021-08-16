import { WebPlugin } from '@capacitor/core';

import type { MediastorePlugin, SavePictureOptions, SavePictureResult } from './definitions';

export class MediastoreWeb extends WebPlugin implements MediastorePlugin {

  async savePicture(options: SavePictureOptions): Promise<SavePictureResult> {
    return new Promise((resolve, reject) => {
      void options;
      void resolve;
      reject('web is not supported');
    });
  }
}
