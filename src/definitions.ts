export interface MediastorePlugin {
  savePicture(options: SavePictureOptions): Promise<SavePictureResult>;
}

export interface SavePictureOptions {
    album?: string;
    filename: string;
    path: string;
}

export interface SavePictureResult {
  uri: string;
}
