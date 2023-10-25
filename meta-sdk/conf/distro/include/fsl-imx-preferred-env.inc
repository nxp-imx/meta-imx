PREFERRED_PROVIDER_virtual/bootloader:imx-nxp-bsp = "u-boot-imx"
PREFERRED_PROVIDER_virtual/kernel:imx-nxp-bsp = "linux-imx"
PREFERRED_PROVIDER_linux-imx-mfgtool = "linux-imx-mfgtool"

PREFERRED_VERSION_gstreamer1.0              = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad  = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-libav        = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server  = "1.22.%"

PREFERRED_VERSION_gstreamer1.0:mx8-nxp-bsp              = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:mx8-nxp-bsp = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:mx8-nxp-bsp = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:mx8-nxp-bsp  = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:mx8-nxp-bsp = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-libav:mx8-nxp-bsp        = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:mx8-nxp-bsp  = "1.22.%"

PREFERRED_VERSION_gstreamer1.0:mx9-nxp-bsp              = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:mx9-nxp-bsp = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:mx9-nxp-bsp = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:mx9-nxp-bsp  = "1.22.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:mx9-nxp-bsp = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-libav:mx9-nxp-bsp        = "1.22.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:mx9-nxp-bsp  = "1.22.%"

BBMASK += "meta-freescale/recipes-multimedia/gstreamer"
BBMASK += "meta-arm/meta-arm/recipes-kernel/linux/linux-yocto_5.15%.bbappend"

PREFERRED_VERSION_opengl-es-cts:mx6-nxp-bsp = "3.2.4.0"
PREFERRED_VERSION_opengl-es-cts:mx7-nxp-bsp = "3.2.4.0"
PREFERRED_VERSION_opengl-es-cts:aarch64 = "3.2.9.3"

# Use systemd as default init manager
VIRTUAL-RUNTIME_init_manager = "systemd"
PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
POKY_DEFAULT_DISTRO_FEATURES += " systemd usrmerge"

# Use virtual-runc as a default container runtime
# runtime: runc, crun, runv, runx
VIRTUAL-RUNTIME_container_runtime = "virtual-runc"
