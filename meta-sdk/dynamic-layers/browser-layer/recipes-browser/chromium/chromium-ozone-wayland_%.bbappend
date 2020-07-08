FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0002-chromium-fix-build-after-y2038-changes-in-glibc.patch \
                   file://Fix-build-breaks-on-non-gbm-machines.patch \
"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += "\
        libxkbcommon \
        virtual/egl \
        wayland \
        wayland-native \
        at-spi2-atk \
"
GN_ARGS += ' \
        system_wayland_scanner_path="${STAGING_BINDIR_NATIVE}/wayland-scanner" \
        use_lld=false \
'
# gbm is availiable only for mx8 
GN_ARGS_append_mx6 = " use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_append_mx7 = " use_system_minigbm=false use_wayland_gbm=false"

CHROMIUM_EXTRA_ARGS_append = " --disable-features=VizDisplayCompositor --in-process-gpu"
