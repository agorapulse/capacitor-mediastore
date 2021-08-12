export interface MediastorePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
