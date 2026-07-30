FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-Avoid-algebraic-cancellation-in-mat_det-and-cross.patch \
    file://0002-Fix-absolute-PresentAt-base-stage-selection.patch \
    file://0003-MGS-9041-add-the-imx-vulkan-cts-REAMME.patch \
    file://0004-Add-missing-conditional-rendering-functionality-chec.patch \
    file://0005-Fix-memory-type-for-host-image-copy-tests.patch \
    file://0006-Add-missing-feature-checks-in-no-queue-tests-2.patch \
    file://0007-Fix-validation-errors-in-copy-memory-indirect-tests.patch \
    file://0008-Fix-remaining-validation-errors-in-VK_KHR_copy_memor.patch"
