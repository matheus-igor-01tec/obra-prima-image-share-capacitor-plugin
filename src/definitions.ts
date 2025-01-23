export interface OpImageSharePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
