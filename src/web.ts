import { WebPlugin } from '@capacitor/core';

import type { MediastorePlugin, SavePictureOptions, SavePictureResponse } from './definitions';

export class MediastoreWeb extends WebPlugin implements MediastorePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async savePicture(options: SavePictureOptions): Promise<SavePictureResponse> {
    console.log('SAVE PICTURE', 'web is not supported yet');
    void options;
    return {uri: ""};
  }
}
