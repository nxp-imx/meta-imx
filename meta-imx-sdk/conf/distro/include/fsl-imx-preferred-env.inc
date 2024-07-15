PREFERRED_PROVIDER_virtual/bootloader:imx-nxp-bsp = "u-boot-imx"
PREFERRED_PROVIDER_virtual/kernel:imx-nxp-bsp = "linux-imx"
PREFERRED_PROVIDER_linux-imx-mfgtool = "linux-imx-mfgtool"

PREFERRED_VERSION_gstreamer1.0              = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad  = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-libav        = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server  = "1.24.%"

PREFERRED_VERSION_gstreamer1.0:mx8-nxp-bsp              = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:mx8-nxp-bsp = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:mx8-nxp-bsp = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:mx8-nxp-bsp  = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:mx8-nxp-bsp = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-libav:mx8-nxp-bsp        = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:mx8-nxp-bsp  = "1.24.%"

PREFERRED_VERSION_gstreamer1.0:mx9-nxp-bsp              = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:mx9-nxp-bsp = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:mx9-nxp-bsp = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:mx9-nxp-bsp  = "1.24.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:mx9-nxp-bsp = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-libav:mx9-nxp-bsp        = "1.24.%"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:mx9-nxp-bsp  = "1.24.%"

PREFERRED_VERSION_xen-tools = "4.18.imx+stable"
PREFERRED_VERSION_xen = "4.18.imx+stable"

QEMUVERSION              = "8.2.2"
QEMUVERSION:mx95-nxp-bsp = "8.2.2.imx"

BBMASK += "meta-freescale/recipes-multimedia/gstreamer"
BBMASK += "meta-arm/meta-arm/recipes-kernel/linux/linux-yocto_5.15%.bbappend"

# Use systemd as default init manager
POKY_INIT_MANAGER = "systemd"

# Use virtual-runc as a default container runtime
# runtime: runc, crun, runv, runx
VIRTUAL-RUNTIME_container_runtime = "virtual-runc"
