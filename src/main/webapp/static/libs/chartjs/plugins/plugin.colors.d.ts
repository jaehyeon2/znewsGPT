import type { Chart } from '../types.js';
export interface ColorsPluginOptions {
    enabled?: boolean;
}
declare const _default: {
    id: string;
    defaults: {
        enabled: boolean;
    };
    beforeLayout(chart: Chart, _args: any, options: ColorsPluginOptions): void;
};
export default _default;
