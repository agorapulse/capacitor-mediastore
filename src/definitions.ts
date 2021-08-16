export interface MediastorePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;

  savePicture(options: SavePictureOptions): Promise<SavePictureResponse>;
}

export interface SavePictureOptions {
    album?: string;
    filename: string;
    path: string;
}

export interface SavePictureResponse {
  uri: string;
}
