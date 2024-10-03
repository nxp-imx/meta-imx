FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Add patches specific to i.MX 6 and 7 with GPU and set package arch accordingly
#SRC_URI += "${SRC_URI_IMXGPU_PATCHES}"
SRC_URI_IMXGPU_PATCHES                    = ""
SRC_URI_IMXGPU_PATCHES:imxgpu:mx6-nxp-bsp = " \
    file://0101-Revert-client-Do-not-warn-about-attached-proxies-on-.patch \
    file://0102-Revert-client-Abort-when-trying-to-add-an-event-to-a.patch \
    file://0103-Revert-client-Warn-when-a-queue-is-destroyed-with-at.patch \
    file://0104-Revert-client-Track-the-proxies-attached-to-a-queue.patch \
    file://0201-Apply-WIP-CL-from-upstream-wayland.patch \
    file://0202-Set-the-default-max-buffer-size-to-unbounded.patch \
    file://0203-Log-the-object-and-methods-when-marshalling-or-sendi.patch \
    file://0204-Fix-buffer-resize-crash.patch \
    file://0205-connection-avoid-calling-memcpy-on-NULL-0.patch"
SRC_URI_IMXGPU_PATCHES:imxgpu:mx7-nxp-bsp = " \
    ${SRC_URI_IMXGPU_PATCHES:imxgpu:mx6-nxp-bsp}"
#PACKAGE_ARCH:imxgpu:mx6-nxp-bsp = "${MACHINE_SOCARCH}"
#PACKAGE_ARCH:imxgpu:mx7-nxp-bsp = "${MACHINE_SOCARCH}"
