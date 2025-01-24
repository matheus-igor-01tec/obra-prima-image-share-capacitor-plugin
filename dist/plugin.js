var capacitorOpImageShare = (function (exports, core) {
    'use strict';

    const OpImageShare = core.registerPlugin('OpImageShare', {
        web: () => Promise.resolve().then(function () { return web; }).then((m) => new m.OpImageShareWeb()),
    });

    class OpImageShareWeb extends core.WebPlugin {
    }

    var web = /*#__PURE__*/Object.freeze({
        __proto__: null,
        OpImageShareWeb: OpImageShareWeb
    });

    exports.OpImageShare = OpImageShare;

    return exports;

})({}, capacitorExports);
//# sourceMappingURL=plugin.js.map
