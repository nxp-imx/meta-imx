FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-ozone-wayland-Don-t-build-gbm_wrappers-without-gbm-u.patch"

SRC_URI_append_mx8 = " file://0001-ozone-wayland-Add-const-keyword-to-getters.patch \
                       file://0002-ozone-wayland-Clean-up-data-device-related-code.patch \
                       file://0003-ozone-Allow-running-presentation-feedback-any-time-a.patch \
                       file://0004-ozone-wayland-Factor-out-zwp-linux-dmabuf-from-the-m.patch \
                       file://0005-ozone-wayland-Handle-viz-process-restart.patch \
                       file://0006-ozone-wayland-Move-the-host-gpu-common-and-test-code.patch \
                       file://0007-Change-the-order-when-the-opaque-region-is-updated.patch \
                       file://0008-Separate-swap-buffer-and-presentation-callbacks.patch \
                       file://0009-Ease-the-buffer-swap-and-maintenance.patch \
                       file://0010-ozone-wayland-Don-t-wait-for-frame-callback-after-su.patch \
                       file://0011-ozone-wayland-Fix-presentation-feedback-flags.patch"

REQUIRED_DISTRO_FEATURES = "wayland"

DEPENDS += "\
        libxkbcommon \
        virtual/egl \
        wayland \
        wayland-native \
"
GN_ARGS += ' \
        system_wayland_scanner_path="${STAGING_BINDIR_NATIVE}/wayland-scanner" \
'
# gbm is availiable only for mx8 
GN_ARGS_append_mx6 = " use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_append_mx7 = " use_system_minigbm=false use_wayland_gbm=false"

CHROMIUM_EXTRA_ARGS_remove_mx8 = "--disable-features=VizDisplayCompositor"
