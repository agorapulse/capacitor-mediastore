import { WebPlugin } from '@capacitor/core';

import type { MediastorePlugin, SavePictureOptions, SavePictureResult,
    SaveToDownloadsOptions, SaveToDownloadsResult, SaveVideoOptions, SaveVideoResult } from './definitions';

export class MediastoreWeb extends WebPlugin implements MediastorePlugin {

    async savePicture(options: SavePictureOptions): Promise<SavePictureResult> {
        return new Promise((resolve, reject) => {
            void options;
            void resolve;
            reject('web is not supported');
        });
    }

    async saveToDownloads(options: SaveToDownloadsOptions): Promise<SaveToDownloadsResult> {
        return new Promise((resolve, reject) => {
            void options;
            void resolve;
            reject('web is not supported');
        });
    }

    async saveVideo(options: SaveVideoOptions): Promise<SaveVideoResult> {
        return new Promise((resolve, reject) => {
            void options;
            void resolve;
            reject('web is not supported');
        });
    }
}
