export interface CapacitorNativeBridgePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
