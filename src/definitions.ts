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

export interface SaveToDownloadsOptions {
    filename?: string;
    path: string;
}

export interface SaveToDownloadsResult {
    uri: string;
}

export interface SaveVideoOptions {
    album?: string;
    filename: string;
    path: string;
}

export interface SaveVideoResult {
    uri: string;
}
